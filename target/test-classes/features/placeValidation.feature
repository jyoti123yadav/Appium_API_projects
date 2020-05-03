Feature: Validating Place API'S

Scenario Outline: Verify if place is successfully added using AddPlaceAPI

	Given Add Place Payload "<name>" "<language>" "<address>"
	When user calls "addPlaceAPI" with "POST" http request 
	Then  the API call got success with status 200
#	And "status" in response body is "OK"
#	And "scope" in response body is "APP"
#	And verify place_Id created maps to "<name>" using "getPlaceAPI"



Examples:
	|name |language |address |
	|A355 | English |World Cross center2345 |
#	|jyotii  | Hindi   |World Cross center |
	