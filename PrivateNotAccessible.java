class PrivateNotAccessible {
    public static void main(String args[]) {
        pentagon p1 = new pentagon(5);
        System.out.println(" Sides = " + p1.sides );
    }



}

class ngon {
    int sides;
    ngon(int s) {
        sides = s;
    }

    ngon() { }
}

class pentagon extends ngon {
    pentagon(int s) {
        super(s);
        sides = s;
    }

    
}