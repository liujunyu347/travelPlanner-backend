package travelPlanner.payload;

import travelPlanner.entity.NearbySearchResult;


public class NearbySearchResponse extends BaseResponse{
	NearbySearchResult.Data[] responseObj;
	
	public NearbySearchResponse(String code, Object obj, String message) {
		super(code, obj, message);
	}
}
