package travelPlanner.controller;

import travelPlanner.entity.NearbySearchResult;
import travelPlanner.entity.PlaceDetailResult;
import travelPlanner.payload.NearbySearchResponse;
import travelPlanner.payload.PlaceDetailResponse;
import travelPlanner.rpc.GoogleMapClient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class PlaceController {
    @GetMapping ("/attractions")
	@ResponseBody
    public NearbySearchResponse getNearbyPlaces(@RequestParam("city") String city) {
        GoogleMapClient client = new GoogleMapClient();
        
        try {
        	NearbySearchResult.Data[] res = client.getNearbyResult(city);
        	return new NearbySearchResponse("200", res, "");
        } catch (Exception e) {
        	return new NearbySearchResponse("500", null, "can't get result");
        }
    }

    @GetMapping("/detail")
	@ResponseBody
    public PlaceDetailResponse getPlaceDetail(@RequestParam("id") String id) {
        GoogleMapClient client = new GoogleMapClient();
        try {
        	PlaceDetailResult.Data res = client.getDetailResult(id);
        	return new PlaceDetailResponse("200", res, "");
        } catch (Exception e) {
        	return new PlaceDetailResponse("500", null, "can't get result");
        }
    }
}