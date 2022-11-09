function fn(){

	var config = {
		name : "Shiva",
		baseUrl : 'https://reqres.in/api'
	};
	
	var env = karate.env
	karate.log('Env is', env)
	
	if (env == "qa"){
	config.baseUrl = 'https://reqres.in/api/qa'
	}
	
	  else if(env == 'dev'){
   config.baseUrl = 'https://reqres.in/api/dev'
  }

  else{
   config.baseURL = 'https://reqres.in/api'
  }
	
	return config;
}