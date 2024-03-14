import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.*;

public class Factory {

    private ArrayList<String> firstNames_f = new ArrayList<String>(Arrays.asList(
            "Adelina", "Ana", "Anca", "Alexandra", "Carmen", "Camelia", "Cristina", "Crina", "Diana", "Eliza", "Eva",
            "Elena", "Felicia", "Florentina", "Geanina", "Georgiana", "Gratiela", "Gina", "Irina", "Iasmina", "Ionela",
            "Iliana", "Isabela", "Iustin", "Julia", "Jeana", "Janina", "Karla", "Karina", "Larisa", "Liliana", "Livia",
            "Lisandra", "Luminita", "Magda","Margareta", "Mara", "Maria", "Marilena",  "Milena", "Marta", "Melania",
            "Miranda", "Mona", "Mirela", "Natalia", "Narcisa", "Nadia", "Nicoleta", "Oana", "Olivia", "Otilia", "Patricia",
            "Raluca", "Rebeca", "Rodica", "Roxana", "Ruxandra", "Silvia", "Sofia", "Tina", "Tatiana", "Valeria", "Veronica"));

    private ArrayList<String> firstNames_m = new ArrayList<String>(Arrays.asList(
            "Adrian", "Alin", "Andrei", "Anghel", "Anton", "Augustin", "Bogdan", "Calin", "Ciprian", "Cosmin", "Catalin",
            "Claudiu", "Daniel", "Darius", "Dorin", "Dragos", "Emil", "Eugen", "Eusebiu","Felix", "Filip", "Flavius",
            "Frederic", "Gabriel", "Gheorghe", "Grigore", "Hector", "Horia", "Ilie", "Ioan", "Ioachim", "Ionut", "Iulian",
            "Iustin", "Justinian", "Laurentiu", "Luca", "Lucian", "Liviu", "Madalin", "Manole", "Marcel", "Manuel",
            "Marcu", "Marian", "Mihai", "Mihnea", "Miron", "Mircea", "Moise", "Nichita", "Octavian", "Ovidiu", "Parasciv",
            "Paul", "Petre", "Pavel", "Radu", "Razvan", "Rares", "Rebeca", "Robert", "Sabin", "Sebastian", "Sergiu",
            "Sorin", "Stefan", "Teodor", "Tudor", "Valentin", "Vasile", "Victor", "Viorel"));

    private ArrayList<String> lastNames = new ArrayList<String>(Arrays.asList(
            "Agirbiceanu", "Albu", "Alexandrescu", "Anghelescu", "Anton", "Apostol", "Ardelean", "Argeseanu", "Avram",
            "Baciu", "Badea", "Balan", "Barbu", "Barbulescu", "Borcea", "Bozga", "Brancoveanu", "Bujor", "Budeanu",
            "Camataru", "Calina", "Calinescu", "Campeanu", "Capra", "Ceaus", "Cernaru", "Chelcea", "Chirila", "Chitu",
            "Cioban", "Ciubuc", "Cocos", "Cojocaru", "Constantinescu", "Cosma", "Cozma", "Craiu", "Croitoru", "Crisan",
            "Danciu", "Dascalescu", "Diaconesu", "Dinu", "Dobre", "Dumitrescu", "Ene", "Fieraru", "Filimon", "Florea",
            "Gabor", "Gheorghiu", "Ghita", "Goga", "Gradinaru", "Grecu", "Grigorescu", "Grosu", "Gusa", "Herescu",
            "Iacob", "Iancu", "Ionescu", "Iordache", "Irimescu", "Ivancea", "Lazarescu", "Lipa", "Luca", "Lupu",
            "Manea", "Magheru", "Manole", "Marinescu", "Mihailescu", "Minculae", "Madgearu", "Miron", "Mocanu",
            "Moldoveanu", "Movila", "Morar", "Mugur", "Muntean", "Mureseanu", "Mugur", "Musat", "Murarescu", "Matei",
            "Pacuraru", "Paduraru", "Palade", "Papura", "Pascu", "Petrescu", "Paun", "Ploiesteanu", "Pop", "Popescu",
            "Popovici", "Porumbescu", "Puscariasu", "Radovicu", "Radulescu", "Romanescu", "Rusu", "Razvan", "Ratiu",
            "Sadoveanu", "Sandu", "Savin", "Serban", "Simion", "Slavici", "Soare", "Solomon", "Stan", "Stefanescu",
            "Steflea", "Stoica", "Stroe", "Surdu", "Schiopu", "Taranu", "Tanase", "Teodorescu", "Toma", "Topor", "Trandafir",
            "Tudor", "Turcu", "Teofil", "Ungureanu", "Urziceanu", "Vaduva", "Vasilescu", "Vantu", "Vladimirescu", "Vlad",
            "Vlaicu", "Voinea", "Varca", "Vulpe", "Vulcanescu", "Zaharescu", "Zidaru", "Zugravescu", "Zamfirescu"));

    //Creaza un user de un tip cu informatii date
    public static User createUser(String type, String firstName, String lastName) {
        if("Student".equals(type)) {
            return new Student(firstName, lastName);
        } else if("Parent".equals(type)) {
            return new Parent(firstName, lastName);
        } else if("Assistant".equals(type)) {
            return new Assistant(firstName, lastName);
        } else if("Teacher".equals(type)) {
            return new Teacher(firstName, lastName);
        }
        return null;
    }

    public ArrayList createStudents(int nr, Faculty faculty, Department department) {
        ArrayList<Student> s = new ArrayList<Student>();
        Random rand = new Random();
        for (int i = 1; i <= nr; i++) {
            String name = lastNames.get(rand.nextInt(lastNames.size()));
            Student stud;
            if (rand.nextInt(2) == 1)
                stud = new Student(firstNames_f.get(rand.nextInt(firstNames_f.size())), name, faculty, department);
            else
                stud = new Student(firstNames_m.get(rand.nextInt(firstNames_m.size())), name, faculty, department);
            stud.setCNP(String.format("%06d", rand.nextInt(999999))+String.format("%05d", rand.nextInt(999999)));
            stud.setFather(new Parent(firstNames_m.get(rand.nextInt(firstNames_m.size())), name));
            stud.setMother(new Parent(firstNames_f.get(rand.nextInt(firstNames_f.size())), name));
            stud.setPassword("parola");
            s.add(stud);
        }
        return s;
    }

    //creaza un numar dat de useri de un tip, cu informatii oarecare
    public ArrayList createUsers(String type, int nr) {
        if(type == null || type.isEmpty())
            return null;
        else if("Student".equals(type)) {
            ArrayList<Student> s = new ArrayList<Student>();
            Random rand = new Random();
            for(int i=1; i<=nr; i++) {
                String name = lastNames.get(rand.nextInt(lastNames.size()));
                Student stud;
                if(rand.nextInt(2) == 1)
                    stud = new Student(firstNames_f.get(rand.nextInt(firstNames_f.size())), name);
                else
                    stud = new Student(firstNames_m.get(rand.nextInt(firstNames_m.size())), name);
                stud.setCNP(String.format("%06d", rand.nextInt(999999)));
                stud.setFather(new Parent(firstNames_m.get(rand.nextInt(firstNames_m.size())), name));
                stud.setMother(new Parent(firstNames_f.get(rand.nextInt(firstNames_f.size())), name));
                s.add(stud);
            }
            return s;
        } else if("Parent".equals(type)) {
            ArrayList<Parent> s = new ArrayList<Parent>();
            Random rand = new Random();
            for(int i=1; i<=nr; i++) {
                if(rand.nextInt(2) == 1)
                    s.add(new Parent(firstNames_f.get(rand.nextInt(firstNames_f.size())), lastNames.get(rand.nextInt(lastNames.size()))));
                else
                    s.add(new Parent(firstNames_m.get(rand.nextInt(firstNames_m.size())), lastNames.get(rand.nextInt(lastNames.size()))));

            }
            return s;
        } else if("Assistant".equals(type)) {
            ArrayList<Assistant> s = new ArrayList<Assistant>();
            Random rand = new Random();
            for(int i=1; i<=nr; i++) {
                if(rand.nextInt(2) == 1)
                    s.add(new Assistant(firstNames_f.get(rand.nextInt(firstNames_f.size())), lastNames.get(rand.nextInt(lastNames.size()))));
                else
                    s.add(new Assistant(firstNames_m.get(rand.nextInt(firstNames_m.size())), lastNames.get(rand.nextInt(lastNames.size()))));
            }
            return s;
        } else if("Teacher".equals(type)) {
            ArrayList<Teacher> s = new ArrayList<Teacher>();
            Random rand = new Random();
            for(int i=1; i<=nr; i++)
                if(rand.nextInt(2) == 1)
                    s.add(new Teacher(firstNames_f.get(rand.nextInt(firstNames_f.size())), lastNames.get(rand.nextInt(lastNames.size()))));
                else
                    s.add(new Teacher(firstNames_m.get(rand.nextInt(firstNames_m.size())), lastNames.get(rand.nextInt(lastNames.size()))));
            return s;
        }
        return null;
    }

    //creaza un grup cu un nr dat de studenti aleatorii, cu asistentul si modul de sortare dat
    public Group createGroup(String ID, Assistant assistant, int nr){
        Random rand = new Random();
        Group group = new Group(ID, assistant);

        for(int i=1; i<=nr; i++) {
            String name = lastNames.get(rand.nextInt(lastNames.size()));
            Student stud;
            if(rand.nextInt(2) == 1)
                stud = new Student(firstNames_f.get(rand.nextInt(firstNames_f.size())), name);
            else
                stud = new Student(firstNames_m.get(rand.nextInt(firstNames_m.size())), name);
            stud.setCNP(String.format("%06d", rand.nextInt(999999)));
            stud.setFather(new Parent(firstNames_m.get(rand.nextInt(firstNames_m.size())), name));
            stud.setMother(new Parent(firstNames_f.get(rand.nextInt(firstNames_f.size())), name));
            group.addStudent(stud);
        }

        return group;
    }



    //creaza un grup cu un nr dat de studenti aleatorii, cu asistentul aleatoriu
    public Group createGroup(String ID, int nr){
        Random rand = new Random();
        Group group;
        if(rand.nextInt(2) == 1)
            group = new Group(ID, new Assistant(firstNames_f.get(rand.nextInt(firstNames_f.size())), lastNames.get(rand.nextInt(lastNames.size()))));
        else
            group = new Group(ID, new Assistant(firstNames_m.get(rand.nextInt(firstNames_m.size())), lastNames.get(rand.nextInt(lastNames.size()))));

        for(int i=1; i<=nr; i++) {
            String name = lastNames.get(rand.nextInt(lastNames.size()));
            Student stud;
            if(rand.nextInt(2) == 1)
                stud = new Student(firstNames_f.get(rand.nextInt(firstNames_f.size())), name);
            else
                stud = new Student(firstNames_m.get(rand.nextInt(firstNames_m.size())), name);
            stud.setCNP(String.format("%06d", rand.nextInt(999999)));
            stud.setFather(new Parent(firstNames_m.get(rand.nextInt(firstNames_m.size())), name));
            stud.setMother(new Parent(firstNames_f.get(rand.nextInt(firstNames_f.size())), name));
            group.addStudent(stud);
        }

        return group;
    }
}