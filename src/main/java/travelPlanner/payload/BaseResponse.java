package travelPlanner.payload;

@lombok.Data
@lombok.AllArgsConstructor
public class BaseResponse<T> {
	protected String responseCode;
	protected T responseObj;
	protected String message;
}
