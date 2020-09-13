package travelPlanner.payload;

import travelPlanner.entity.PlaceDetailResult;

public class PlaceDetailResponse extends BaseResponse{
	PlaceDetailResult.Data responseObj;
	
	public PlaceDetailResponse(String responseCode, Object responseObj, String message) {
		super(responseCode, responseObj, message);
	}
}
