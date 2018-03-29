package MallApp;

public class CategoryCreator {
    public static Category createCategories(String  name) throws CategoryNotFoundException{
        Category categories = null;
        String n=name;
        if(name.equalsIgnoreCase ( "food" ))
        {
            return new Category(6, "food");
        }
        else if (name.equalsIgnoreCase ( "electronics" ))
        {
            return new Category(18, "Electronics");
        }
        else if(name.equalsIgnoreCase ( "other" ))
        {
            return new Category(6, "Other");
        }

//        if(n.equalsIgnoreCase("potato")||n.equalsIgnoreCase("maggie")||n.equalsIgnoreCase("onion")||n.equalsIgnoreCase("tomato")||n.equalsIgnoreCase("buscuits")) {
//
//            categories = new Category(6, "food");
//        }
//        else if (n.equalsIgnoreCase("mobile")||n.equalsIgnoreCase("laptop")||n.equalsIgnoreCase("tv")||n.equalsIgnoreCase("fridge")||n.equalsIgnoreCase("washing machine")){
//            categories = new Category(18, "Electronics");
//        }
//        else {
//            categories = new Category(6, "Other");
//        }
        return categories;
    }
}
