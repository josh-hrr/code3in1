function friend(friends){ 

  const filterData = friends.filter(value => {
    if(value.length === 4){
      return value;
    }
  }) 
  return filterData; 
}
