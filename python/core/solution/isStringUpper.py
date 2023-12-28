def is_uppercase(inp):  
    counter = 0
    all_uppercase = False
    for value in inp:
        if value.isalpha() and not value.isupper(): 
            counter = counter + 1  

    if counter == 0:
        all_uppercase = True;
        print("True")
    else:
        all_uppercase = False;
        print("False")
    return all_uppercase;
