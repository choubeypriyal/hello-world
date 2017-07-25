class EmailService{

	private final LocationServices locationServices = new LocationServices();
	private final SecurityServices securityServices = new SecurityServices();

	void sendEmail(String user, String email, String message){
		if(LocationServices.checkLocation(locationServices.retrieveLocation(email))){
			if(securityServices.checkPermission(user)){
				if(exists(email)){
					System.out.println("Email is sent to "+email+ " with message : "+message);
				}
			}
		}
	}	

	boolean exists(String email){
		//20 loc to check in DB
		if(email.endsWith("@yahoo.com")) {
			return true;
		}else{
			return false;
		}
	}

}