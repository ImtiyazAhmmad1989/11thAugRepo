def m1(params){


println '******PRINTING ALL ITEMS ******'
	
	
for (param in params) {
        String[] paramArray = param.split(":", 2)
        String key = paramArray[0]
        if (paramArray.length == 2) {
            String value = paramArray[1]
            println value
            parent.parameterMap.put(key.toString().trim(), value.toString().trim())
        } else if (paramArray.length == 1) {
            parent.parameterMap.put(key.toString().trim(), "")
        }

}
}
