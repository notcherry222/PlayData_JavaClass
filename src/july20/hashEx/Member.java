package july20.hashEx;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    //equals overriding
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;
            return member.name.equals(name) && (member.age == age);}
        else{ return false;}
    }

    //hashcode overriding
    public int hashCode(){
        return name.hashCode()+age;
    }
}
