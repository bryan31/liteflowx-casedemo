def count_key = "count"
if (defaultContext.hasData(count_key)){
    def count = defaultContext.getData(count_key)
    if (count >= 3){
        return true
    }else{
        defaultContext.setData(count_key, ++count)
        return false
    }
}else{
    defaultContext.setData(count_key, 1)
    return false
}