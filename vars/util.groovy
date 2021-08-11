def m1(){


println '******PRINTING ALL ITEMS ******'

	Jenkins.instance.getAllItems().each{

    println it.fullName
 
	}


}