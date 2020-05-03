package resourrces;



	//enum is a special class in java which has collection of constants and methods
	
	
	public enum APIResources {	
	
		addPlaceAPI("/maps/api/place/add/json"),
		getPlaceAPI("/maps/api/place/get/json"),
		deletePlaceAPI("/maps/api/place/delete/json");
		
		private String resources;
		
		APIResources(String resources)
		{
			this.resources=resources;
		}
		
		
		
		public String getResource()
		{
			
			return resources;
		}
	
}
