public class Library {
    private Department[] departments;

    public Library() {
        departments = new Department[3];
        departments[0] = new Department("художественная", 100);
        departments[1] = new Department("юридическая", 100);
        departments[2] = new Department("техническая", 100);



    }
}
