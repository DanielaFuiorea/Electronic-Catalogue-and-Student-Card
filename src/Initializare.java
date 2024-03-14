import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Initializare implements Serializable {
    public static void main(String[] args) {

        Catalog catalog = Catalog.getInstance();
        Teacher t1 = new Teacher("Andrei", "Popescu");
        t1.setPassword("1234");
        t1.setCNP("4428286551348");
        t1.setPath("images/teachers/3.png");
        Teacher t2 = new Teacher("Mihaela", "Trandafir");
        t2.setPassword("1234");
        t2.setCNP("6747111681159 ");
        t2.setPath("images/teachers/4.png");
        Teacher t3 = new Teacher("Ion", "Andronescu");
        t3.setPassword("1234");
        t3.setCNP("7454795692568");
        t3.setPath("images/teachers/2.png");
        Teacher t4 = new Teacher("Razvan", "Xenopol");
        t4.setPassword("1234");
        t4.setCNP("5123570455373");
        t4.setPath("images/teachers/1.png");




        Faculty f1 = new Faculty("Facultatea de Site-uri Web", t2);
        Faculty f2 = new Faculty("Facultatea de Aplicatii si Management de Date", t1);
        Faculty f3 = new Faculty("Facultatea de Automatizare", t3);
        Faculty f4 = new Faculty("Facultatea de Programare Low Level", t4);

        Department d1 = new Department("Front End si Design");
        Department d2 = new Department("Back End si Securitate");
        Department d3 = new Department("Dezvoltarea si Designul Jocurlor Video");
        Department d4 = new Department("Managementul de Servere si Baze de Date");
        Department d5 = new Department("Inteligenta Artificiala si Machine Learning");
        Department d6 = new Department("Dezvoltarea si Designul Sistemelor de Operare");
        Department d7 = new Department("Optimizarea Programelor");
        Department d8 = new Department("Programare pe Hardware");

        Assistant a1 = new Assistant("Miahil", "Manea");
        a1.setPassword("1234");
        a1.setCNP("8796572246297");
        Assistant a2 = new Assistant("Nicoleta", "Alexe");
        a2.setPassword("1234");
        a2.setCNP("2909648646789");
        Assistant a3 = new Assistant("Gabriel", "Tanase");
        a3.setPassword("1234");
        a3.setCNP("6648972559107");
        Assistant a4 = new Assistant("Alexia", "Tudor");
        a4.setPassword("1234");
        a4.setCNP("6858246325449");
        Assistant a5 = new Assistant("Vlad", "Rusu");
        a5.setPassword("1234");
        a5.setCNP("6724461138313");

        ArrayList<Student> students1 = new Factory().createStudents( 9, f1, d1);


        Parent p1M = new Parent("Maria", "Cocos");
        p1M.setPassword("1234");
        p1M.setCNP("7570600281785");
        p1M.setEmail("mariuca_cocosel@yahoo.com");

        Parent p1F = new Parent("Alexandru", "Cocos");
        p1F.setPassword("1234");
        p1F.setCNP("5519520235081");
        p1F.setEmail("alexandrucoco@gmail.com");

        Student s1 = new Student("Daniel", "Cocos", f1, d1);
        s1.setPassword("1234");
        s1.setCNP("1064704086546");
        s1.setPath("images/students/1.png");
        s1.setFather(p1F);
        s1.setMother(p1M);
        s1.addContract(new Contract("images/students/contract1.png", 1));
        s1.addContract(new Contract("images/students/contract2.png", 2));

        students1.add(s1);

        ArrayList<Student> students2 = new Factory().createStudents( 9, f1, d2);



        Parent p2M = new Parent("Adriana", "Balcescu");
        p2M.setPassword("1234");
        p2M.setCNP("1804967251531");
        p2M.setEmail("adryanaa@yahoo.com");

        Parent p4F = new Parent("Cristian", "Floare");
        p4F.setPassword("1234");
        p4F.setCNP("8789260418739");
        p4F.setEmail("cristian.floare@gmail.com");

        Student s2 = new Student("Gabriel", "Floare", f1, d2);
        s2.setPassword("1234");
        s2.setCNP("8209247240468");
        s2.setPath("images/students/2.png");
        s2.setFather(p4F);
        s2.setMother(p2M);
        s2.addContract(new Contract("images/students/contract1.png", 1));

        students2.add(s2);

        ArrayList<Student> students3 = new Factory().createStudents( 9, f2, d3);

        Parent p3M = new Parent("Gratiela", "Grosu");
        p3M.setPassword("1234");
        p3M.setCNP("3281565551001");
        p3M.setEmail("gratiela_grosu@yahoo.com");

        Parent p3F = new Parent("Razvan", "Grosu");
        p3F.setPassword("1234");
        p3F.setCNP("4817492955320");
        p3F.setEmail("razvan.grosu@yahoo.com");

        Student s3 = new Student("Constantin", "Grosu", f2, d3);
        s3.setPassword("1234");
        s3.setCNP("931659295543");
        s3.setPath("images/students/3.png");
        s3.setFather(p3F);
        s3.setMother(p3M);
        s3.addContract(new Contract("images/students/contract1.png", 1));

        students3.add(s3);

        ArrayList<Student> students4 = new Factory().createStudents( 9, f2, d4);

        Parent p4M = new Parent("Angelica", "Floare");
        p4M.setPassword("1234");
        p4M.setCNP("2644123405796 ");
        p4M.setEmail("angelica.floare@yahoo.com");

        Student s4 = new Student("Petru", "Floare", f2, d4);
        s4.setPassword("1234");
        s4.setCNP("3727812169126");
        s4.setPath("images/students/4.png");
        s4.setFather(p4F);
        s4.setMother(p4M);
        s4.addContract(new Contract("images/students/contract1.png", 1));

        students4.add(s4);

        ArrayList<Student> students5 = new Factory().createStudents( 9, f3, d5);


        Student s5 = new Student("Ioana", "Grosu", f3, d5);
        s5.setPassword("1234");
        s5.setCNP("9289667383096");
        s5.setPath("images/students/5.png");
        s5.setFather(p3F);
        s5.setMother(p3M);
        s5.addContract(new Contract("images/students/contract1.png", 1));

        students5.add(s5);

        ArrayList<Student> students6 = new Factory().createStudents( 9, f3, d6);


        Student s6 = new Student("Daniela", "Floare", f3, d6);
        s6.setPassword("1234");
        s6.setCNP("2901785374339");
        s6.setPath("images/students/6.png");
        s6.setFather(p4F);
        s6.setMother(p4M);
        s6.addContract(new Contract("images/students/contract1.png", 1));
        s6.addContract(new Contract("images/students/contract2.png", 2));

        students6.add(s6);

        ArrayList<Student> students7 = new Factory().createStudents( 9, f4, d7);

        Parent p7M = new Parent("Madalina", "Turcu");
        p7M.setPassword("1234");
        p7M.setCNP("2261111729885");
        p7M.setEmail("madalina.turcu@gmail.com");

        Parent p7F = new Parent("George", "Turcu");
        p7F.setPassword("1234");
        p7F.setCNP("9680688553922");
        p7F.setEmail("georgicaceldur@yahoo.com");


        Student s7 = new Student("Ionela", "Turcu", f4, d7);
        s7.setPassword("1234");
        s7.setCNP("6512950478325");
        s7.setPath("images/students/7.png");
        s7.setFather(p7F);
        s7.setMother(p7M);
        s7.addContract(new Contract("images/students/contract1.png", 1));
        s7.addContract(new Contract("images/students/contract2.png", 2));

        students7.add(s7);

        ArrayList<Student> students8 = new Factory().createStudents( 9, f4, d8);

        Parent p8M = new Parent("Magdalena", "Popescu");
        p8M.setPassword("1234");
        p8M.setCNP("4613350563027");
        p8M.setEmail("magda.magdalena@yahoo.com");

        Parent p8F = new Parent("Valentin", "Popescu");
        p8F.setPassword("1234");
        p8F.setCNP("7120834544512");
        p8F.setEmail("vali_pop1970@yahoo.com");

        Student s8 = new Student("Denisa", "Popescu", f4, d8);
        s8.setPassword("1234");
        s8.setCNP("8379091412816");
        s8.setPath("images/students/8.png");
        s8.setFather(p8F);
        s8.setMother(p8M);
        s8.addContract(new Contract("images/students/contract1.png", 1));
        s8.addContract(new Contract("images/students/contract2.png", 2));

        students8.add(s8);


        ArrayList<Student> students11 = new Factory().createStudents( 10, f1, d1);
        ArrayList<Student> students22 = new Factory().createStudents( 10, f1, d2);
        ArrayList<Student> students32 = new Factory().createStudents( 10, f2, d3);
        ArrayList<Student> students42 = new Factory().createStudents( 10, f2, d4);
        ArrayList<Student> students52 = new Factory().createStudents( 10, f3, d5);
        ArrayList<Student> students61 = new Factory().createStudents( 10, f3, d6);
        ArrayList<Student> students71 = new Factory().createStudents( 10, f4, d7);
        ArrayList<Student> students81 = new Factory().createStudents( 10, f4, d8);



        Course c0 = new PartialCourse(new PartialCourse.PartialCourseBuilder("Pseudocod", 5));
        c0.setTeacher(t2);
        c0.strategy = new BestTotalScore();
        c0.setDescription("Un limbaj pseudocod este o scriere intermediara, menita sa simplifice scrierea unui algoritm intr-un limbaj de programare " +
                "si sa ajute la realizarea claritatii algoritmului, in timp scurt.");

        c0.addGroup(new Group("FED", a2));
        for(Student i : students11)
            c0.addStudent("FED", i);
        c0.addGroup(new Group("BES", a2));
        for(Student i : students2)
            c0.addStudent("BES", i);
        c0.addGroup(new Group("DDJV", a2));
        for(Student i : students3)
            c0.addStudent("DDJV", i);
        c0.addGroup(new Group("MSBD", a2));
        for(Student i : students4)
            c0.addStudent("MSBD", i);
        c0.addGroup(new Group("IAML", a3));
        for(Student i : students5)
            c0.addStudent("IAML", i);
        c0.addGroup(new Group("DDSO", a3));
        for(Student i : students61)
            c0.addStudent("DDSO", i);
        c0.addGroup(new Group("OP", a3));
        for(Student i : students71)
            c0.addStudent("OP", i);
        c0.addGroup(new Group("PH", a3));
        for(Student i : students81)
            c0.addStudent("PH", i);

        for(Student i : c0.getAllStudents())
            c0.addGrade(new Grade(c0.getName(), i));

        Course c1 = new FullCourse(new FullCourse.FullCourseBuilder("Matematica", 4));
        c1.setTeacher(t3);
        c1.strategy = new BestTotalScore();
        c1.setDescription("Matematica este in general definita ca stiinta ce studiaza relatiile cantitative, modelele de structura (relatii calitative), " +
                "de schimbare si de spatiu. in sens modern, matematica este investigarea structurilor abstracte definite in mod axiomatic folosind logica formala.");

        c1.addGroup(new Group("FED", a4));
        for(Student i : students11)
            c1.addStudent("FED", i);
        c1.addGroup(new Group("BES", a4));
        for(Student i : students2)
            c1.addStudent("BES", i);
        c1.addGroup(new Group("DDJV", a4));
        for(Student i : students3)
            c1.addStudent("DDJV", i);
        c1.addGroup(new Group("MSBD", a4));
        for(Student i : students4)
            c1.addStudent("MSBD", i);
        c1.addGroup(new Group("IAML", a5));
        for(Student i : students5)
            c1.addStudent("IAML", i);
        c1.addGroup(new Group("DDSO", a5));
        for(Student i : students61)
            c1.addStudent("DDSO", i);
        c1.addGroup(new Group("OP", a5));
        for(Student i : students71)
            c1.addStudent("OP", i);
        c1.addGroup(new Group("PH", a5));
        for(Student i : students81)
            c1.addStudent("PH", i);

        for(Student i : c1.getAllStudents())
            c1.addGrade(new Grade(c1.getName(), i));

        Course c2 = new FullCourse(new FullCourse.FullCourseBuilder("Algoritmi", 5));
        c2.setTeacher(t3);
        c2.strategy = new BestTotalScore();
        c2.setDescription("Algoritmul este notiunea centrala a informaticii. Totul este construit in jurul algoritmilor. Un algoritm inseamna o metoda " +
                "sau o procedura de calcul, alcatuita din pasii sau operatiile elementare necesare pentru rezolvarea unei probleme sau categorii de probleme.");

        c2.addGroup(new Group("FED", a3));
        for(Student i : students11)
            c2.addStudent("FED", i);
        c2.addGroup(new Group("BES", a3));
        for(Student i : students2)
            c2.addStudent("BES", i);
        c2.addGroup(new Group("DDJV", a3));
        for(Student i : students3)
            c2.addStudent("DDJV", i);
        c2.addGroup(new Group("MSBD", a3));
        for(Student i : students4)
            c2.addStudent("MSBD", i);
        c2.addGroup(new Group("IAML", a1));
        for(Student i : students5)
            c2.addStudent("IAML", i);
        c2.addGroup(new Group("DDSO", a1));
        for(Student i : students61)
            c2.addStudent("DDSO", i);
        c2.addGroup(new Group("OP", a1));
        for(Student i : students71)
            c2.addStudent("OP", i);
        c2.addGroup(new Group("PH", a1));
        for(Student i : students81)
            c2.addStudent("PH", i);

        for(Student i : c2.getAllStudents())
            c2.addGrade(new Grade(c2.getName(), i));

        Course c3 = new PartialCourse(new PartialCourse.PartialCourseBuilder("Limbajul C", 5));
        c3.setTeacher(t1);
        c3.strategy = new BestExamScore();
        c3.setDescription("C este un limbaj de programare standardizat. Este implementat pe majoritatea platformelor de calcul existente azi, si este " +
                "cel mai popular limbaj de programare pentru scrierea de software de sistem. Este apreciat pentru eficienta codului obiect generat de compilatoarele C, si pentru portabilitatea sa.");

        c3.addGroup(new Group("DDJV", a4));
        for(Student i : students3)
            c3.addStudent("DDJV", i);
        c3.addGroup(new Group("DDSO", a4));
        for(Student i : students61)
            c3.addStudent("DDSO", i);
        c3.addGroup(new Group("OP", a4));
        for(Student i : students71)
            c3.addStudent("OP", i);
        c3.addGroup(new Group("PH", a4));
        for(Student i : students81)
            c3.addStudent("PH", i);

        for(Student i : c3.getAllStudents())
            c3.addGrade(new Grade(c3.getName(), i));

        Course c4 = new PartialCourse(new PartialCourse.PartialCourseBuilder("Limbajul C++", 4));
        c4.setTeacher(t1);
        c4.strategy = new BestExamScore();
        c4.setDescription("C++ este un limbaj de programare general, compilat. Este un limbaj multi-paradigma, cu verificarea statica a tipului " +
                "variabilelor ce suporta programare procedurala, abstractizare a datelor, programare orientata pe obiecte. In anii 1990, C++ a devenit " +
                "unul dintre cele mai populare limbaje de programare comerciale, ramanand astfel pana azi.");

        c4.addGroup(new Group("DDJV", a1));
        for(Student i : students32)
            c4.addStudent("DDJV", i);
        c4.addGroup(new Group("IAML", a1));
        for(Student i : students52)
            c4.addStudent("IAML", i);
        c4.addGroup(new Group("DDSO", a1));
        for(Student i : students6)
            c4.addStudent("DDSO", i);
        c4.addGroup(new Group("OP", a1));
        for(Student i : students7)
            c4.addStudent("OP", i);

        for(Student i : c4.getAllStudents())
            c4.addGrade(new Grade(c4.getName(), i));

        Course c5 = new PartialCourse(new PartialCourse.PartialCourseBuilder("Limbajul C#", 2));
        c5.setTeacher(t1);
        c5.strategy = new BestExamScore();
        c5.setDescription("C# este un limbaj de programare orientat-obiect conceput de Microsoft la sfarsitul anilor 90. A fost conceput ca un concurent " +
                "pentru limbajul Java. Ca si acesta, C# este un derivat al limbajului de programare C++.");

        c5.addGroup(new Group("BES", a1));
        for(Student i : students22)
            c5.addStudent("BES", i);
        c5.addGroup(new Group("DDJV", a1));
        for(Student i : students32)
            c5.addStudent("DDJV", i);

        for(Student i : c5.getAllStudents())
            c5.addGrade(new Grade(c5.getName(), i));


        Course c6 = new PartialCourse(new PartialCourse.PartialCourseBuilder("Limbajul Java", 5));
        c6.setTeacher(t2);
        c6.strategy = new BestTotalScore();
        c6.setDescription("Java este un limbaj de programare orientat-obiect, puternic tipizat, fiind lansat in 1995. Cele mai multe aplicatii distribuite " +
                "sunt scrise in Java, iar noile evolutii tehnologice permit utilizarea sa si pe dispozitive mobile, spre exemplu telefon, agenda " +
                "electronica, palmtop etc. in felul acesta se creeaza o platforma unica, la nivelul programatorului, deasupra unui mediu eterogen extrem " +
                "de diversificat.");

        c6.addGroup(new Group("DDJV", a1));
        for(Student i : students32)
            c6.addStudent("DDJV", i);
        c6.addGroup(new Group("IAML", a1));
        for(Student i : students52)
            c6.addStudent("IAML", i);
        c6.addGroup(new Group("DDSO", a1));
        for(Student i : students6)
            c6.addStudent("DDSO", i);
        c6.addGroup(new Group("OP", a1));
        for(Student i : students7)
            c6.addStudent("OP", i);

        for(Student i : c6.getAllStudents())
            c6.addGrade(new Grade(c6.getName(), i));

        Course c7 = new PartialCourse(new PartialCourse.PartialCourseBuilder("Limbajul JavaScript", 3));
        c7.setTeacher(t2);
        c7.strategy = new BestTotalScore();
        c7.setDescription("JavaScript este un limbaj de programare orientat obiect bazat pe conceptul prototipurilor. Este folosit mai ales pentru " +
                "introducerea unor functionalitati in paginile web, codul JavaScript din aceste pagini fiind rulat de catre browser. Limbajul este " +
                "binecunoscut pentru folosirea sa in construirea siturilor web, dar este folosit si pentru accesul la obiecte incapsulate in alte aplicatii.");

        c7.addGroup(new Group("FED", a1));
        for(Student i : students1)
            c7.addStudent("FED", i);
        c7.addGroup(new Group("IAML", a1));
        for(Student i : students52)
            c7.addStudent("IAML", i);

        for(Student i : c7.getAllStudents())
            c7.addGrade(new Grade(c7.getName(), i));

        Course c8 = new PartialCourse(new PartialCourse.PartialCourseBuilder("Limbajul HTML", 4));
        c8.setTeacher(t2);
        c8.strategy = new BestTotalScore();
        c8.setDescription("HyperText Markup Language (HTML) este un limbaj de marcare utilizat pentru crearea paginilor web ce pot fi afisate intr-un " +
                "browser (sau navigator). Scopul HTML este mai degraba prezentarea informatiilor – paragrafe, fonturi, tabele s.a.m.d. – decat descrierea " +
                "semanticii documentului.");

        c8.addGroup(new Group("FED", a2));
        for(Student i : students1)
            c8.addStudent("FED", i);

        for(Student i : c8.getAllStudents())
            c8.addGrade(new Grade(c8.getName(), i));


        Course c9 = new PartialCourse(new PartialCourse.PartialCourseBuilder("Limbajul CSS", 2));
        c9.strategy = new BestTotalScore();
        c9.setTeacher(t2);
        c9.setDescription("CSS sau Cascading Style Sheets este un standard pentru formatarea elementelor unui document HTML. CSS permite separarea si " +
                "prezentarea vizuala a continutului unei pagini web, inclusiv culorile si fonturile disponibile.[3] Separarea elementelor unei pagini " +
                "imbunatateste accesibilitatea paginii si permite o mai buna flexibilitate si un control in specificatiile caracteristicilor de prezentare.");

        c9.addGroup(new Group("FED", a2));
        for(Student i : students1)
            c9.addStudent("FED", i);

        for(Student i : c9.getAllStudents())
            c9.addGrade(new Grade(c9.getName(), i));

        Course c10 = new PartialCourse(new PartialCourse.PartialCourseBuilder("Limbajul PHP", 3));
        c10.setTeacher(t1);
        c10.strategy = new BestExamScore();
        c10.setDescription("PHP este un limbaj de programare. Numele PHP provine din limba engleza si este un acronim recursiv : Php: Hypertext " +
                "Preprocessor. Folosit initial pentru a produce pagini web dinamice, este folosit pe scara larga in dezvoltarea paginilor si aplicatiilor web.");

        c10.addGroup(new Group("FED", a5));
        for(Student i : students11)
            c10.addStudent("FED", i);
        c10.addGroup(new Group("BES", a5));
        for(Student i : students2)
            c10.addStudent("BES", i);
        c10.addGroup(new Group("MSBD", a5));
        for(Student i : students4)
            c10.addStudent("MSBD", i);
        c10.addGroup(new Group("IAML", a5));
        for(Student i : students5)
            c10.addStudent("IAML", i);

        for(Student i : c10.getAllStudents())
            c10.addGrade(new Grade(c10.getName(), i));

        Course c11 = new PartialCourse(new PartialCourse.PartialCourseBuilder("Limbajul Python", 4));
        c11.setTeacher(t1);
        c11.strategy = new BestExamScore();
        c11.setDescription("Python pune accentul pe curatenia si simplitatea codului, iar sintaxa sa le permite dezvoltatorilor sa exprime unele idei " +
                "programatice intr-o maniera mai clara si mai concisa decat in alte limbaje de programare ca C. in ceea ce priveste paradigma de " +
                "programare, Python poate servi ca limbaj pentru software de tipul object-oriented, dar permite si programarea imperativa, functionala " +
                "sau procedurala.");

        c11.addGroup(new Group("BES", a3));
        for(Student i : students22)
            c11.addStudent("BES", i);
        c11.addGroup(new Group("DDJV", a3));
        for(Student i : students32)
            c11.addStudent("DDJV", i);
        c11.addGroup(new Group("IAML", a3));
        for(Student i : students52)
            c11.addStudent("IAML", i);

        for(Student i : c11.getAllStudents())
            c11.addGrade(new Grade(c11.getName(), i));


        Course c12 = new FullCourse(new FullCourse.FullCourseBuilder("Limbajul SQL", 4));
        c12.setTeacher(t4);
        c12.strategy = new BestPartialScore();
        c12.setDescription("SQL (de la numele englez Structured Query Language - limbaj de interogare structurat) este un limbaj de programare specific " +
                "pentru manipularea datelor in sistemele de manipulare a bazelor de date relationale (RDBMS), iar la origine este un limbaj bazat pe " +
                "algebra relationala. Acesta are ca scop inserarea datelor, interogatii, actualizare si stergere, modificarea si crearea schemelor, " +
                "precum si controlul accesului la date.");

        c12.addGroup(new Group("MSBD", a3));
        for(Student i : students42)
            c12.addStudent("MSBD", i);

        for(Student i : c12.getAllStudents())
            c12.addGrade(new Grade(c12.getName(), i));


        Course c13 = new FullCourse(new FullCourse.FullCourseBuilder("Limbajul Ruby", 2));
        c13.setTeacher(t4);
        c13.strategy = new BestPartialScore();
        c13.setDescription("Ruby este un limbaj de programare generic, reflexiv, dinamic si orientat pe obiecte. Este un limbaj orientat pe obiecte: " +
                "fiecare tip de date este un obiect, inclusive clasele si tipurile pe care multe alte limbaje le considera primitive (cum ar fi tipul " +
                "intreg, boolean si “nil”).");

        c13.addGroup(new Group("BES", a2));
        for(Student i : students22)
            c13.addStudent("BES", i);
        c13.addGroup(new Group("MSBD", a2));
        for(Student i : students42)
            c13.addStudent("MSBD", i);

        for(Student i : c13.getAllStudents())
            c13.addGrade(new Grade(c13.getName(), i));


        Course c14 = new FullCourse(new FullCourse.FullCourseBuilder("Designul Bazelor de Date", 2));
        c14.setTeacher(t4);
        c14.strategy = new BestPartialScore();
        c14.setDescription("O baza de date, uneori numita si banca de date (abreviat BD), reprezinta o modalitate de stocare a unor informatii si date pe " +
                "un suport extern (un dispozitiv de stocare), cu posibilitatea extinderii usoare si a regasirii rapide a acestora.");

        c14.addGroup(new Group("FED", a2));
        for(Student i : students1)
            c14.addStudent("FED", i);
        c14.addGroup(new Group("MSBD", a2));
        for(Student i : students42)
            c14.addStudent("MSBD", i);

        for(Student i : c14.getAllStudents())
            c14.addGrade(new Grade(c14.getName(), i));

        Course c15 = new FullCourse(new FullCourse.FullCourseBuilder("Limbajul Go", 3));
        c15.setTeacher(t4);
        c15.strategy = new BestPartialScore();
        c15.setDescription("Go este un limbaj de programare compilat, tipizat static, conceput la Google. Go este similar din punct de vedere sintactic " +
                "cu C, dar cu siguranta memoriei, colectarea gunoiului, tipizare structurala.");

        c15.addGroup(new Group("MSBD", a5));
        for(Student i : students42)
            c15.addStudent("MSBD", i);
        c15.addGroup(new Group("DDSO", a5));
        for(Student i : students6)
            c15.addStudent("DDSO", i);

        for(Student i : c15.getAllStudents())
            c15.addGrade(new Grade(c15.getName(), i));

        Course c16 = new FullCourse(new FullCourse.FullCourseBuilder("Limbajul Assembly", 4));
        c16.setTeacher(t4);
        c16.strategy = new BestPartialScore();
        c16.setDescription("Un limbaj de asamblare este un limbaj de programare a calculatoarelor care, in locul codului masina, foloseste o desemnare " +
                "simbolica a elementelor programului, relativ usor de citit si interpretat de catre om.");

        c16.addGroup(new Group("OP", a5));
        for(Student i : students7)
            c16.addStudent("OP", i);
        c16.addGroup(new Group("PH", a5));
        for(Student i : students8)
            c16.addStudent("PH", i);

        for(Student i : c16.getAllStudents())
            c16.addGrade(new Grade(c16.getName(), i));

        Course c17 = new FullCourse(new FullCourse.FullCourseBuilder("Limbajul Masina", 3));
        c17.setTeacher(t4);
        c17.strategy = new BestPartialScore();
        c17.setDescription("Limbajul masina sau codul masina este un set de instructiuni fundamentale care depind de tipul de computer pe care il " +
                "utilizati. O instructiune specifica scrisa in limbaj masina ar putea sa comunice unitatii centrale sa adune doua numere si sa memoreze " +
                "rezultatul intr-un anumit loc. O unitate centrala tipica recunoaste cateva duzini de asemenea comenzi, fiecare dintre ele fiind destinata " +
                "sa indeplineasca o sarcina mica si foarte specializata.");

        c17.addGroup(new Group("OP", a4));
        for(Student i : students7)
            c17.addStudent("OP", i);
        c17.addGroup(new Group("PH", a4));
        for(Student i : students8)
            c17.addStudent("PH", i);

        for(Student i : c17.getAllStudents())
            c17.addGrade(new Grade(c17.getName(), i));

        Course c18 = new FullCourse(new FullCourse.FullCourseBuilder("Proiectare pe Microprocesoare", 5));
        c18.setTeacher(t4);
        c18.strategy = new BestPartialScore();
        c18.setDescription("Un microprocesor este un procesor ale carui componente au fost suficient de miniaturizate pentru a fi grupate intr-un singur " +
                "circuit integrat. ");

        c18.addGroup(new Group("IAML", a4));
        for(Student i : students52)
            c18.addStudent("IAML", i);
        c18.addGroup(new Group("PH", a4));
        for(Student i : students8)
            c18.addStudent("PH", i);

        for(Student i : c18.getAllStudents())
            c18.addGrade(new Grade(c18.getName(), i));


        Course c19 = new FullCourse(new FullCourse.FullCourseBuilder("Limbajul Rust", 5));
        c19.setTeacher(t4);
        c19.strategy = new BestPartialScore();
        c19.setDescription("Rust este un limbaj de programare axat pe siguranta, in special concurenta sigura. Rust este similar sintactic cu C++, dar " +
                "este conceput pentru a oferi o mai buna siguranta a memoriei, mentinand in acelasi timp performante ridicate.");

        c19.addGroup(new Group("BES", a2));
        for(Student i : students22)
            c19.addStudent("BES", i);
        c19.addGroup(new Group("PH", a2));
        for(Student i : students8)
            c19.addStudent("PH", i);

        for(Student i : c19.getAllStudents())
            c19.addGrade(new Grade(c19.getName(), i));

        catalog.addCourse(c0);
        d1.addCourse(c0);
        d2.addCourse(c0);
        d3.addCourse(c0);
        d4.addCourse(c0);
        d5.addCourse(c0);
        d6.addCourse(c0);
        d7.addCourse(c0);
        d8.addCourse(c0);
        catalog.addCourse(c1);
        d1.addCourse(c1);
        d2.addCourse(c1);
        d3.addCourse(c1);
        d4.addCourse(c1);
        d5.addCourse(c1);
        d6.addCourse(c1);
        d7.addCourse(c1);
        d8.addCourse(c1);
        catalog.addCourse(c2);
        d1.addCourse(c2);
        d2.addCourse(c2);
        d3.addCourse(c2);
        d4.addCourse(c2);
        d5.addCourse(c2);
        d6.addCourse(c2);
        d7.addCourse(c2);
        d8.addCourse(c2);
        catalog.addCourse(c3);
        d3.addCourse(c3);
        d6.addCourse(c3);
        d7.addCourse(c3);
        d8.addCourse(c3);
        catalog.addCourse(c4);
        d3.addCourse(c4);
        d5.addCourse(c4);
        d6.addCourse(c4);
        d7.addCourse(c4);
        catalog.addCourse(c5);
        d2.addCourse(c5);
        d3.addCourse(c5);
        catalog.addCourse(c6);
        d3.addCourse(c6);
        d5.addCourse(c6);
        d6.addCourse(c6);
        d7.addCourse(c6);
        catalog.addCourse(c7);
        d1.addCourse(c7);
        d5.addCourse(c7);
        catalog.addCourse(c8);
        d1.addCourse(c8);
        catalog.addCourse(c9);
        d1.addCourse(c9);
        catalog.addCourse(c10);
        d1.addCourse(c10);
        d2.addCourse(c10);
        d4.addCourse(c10);
        d5.addCourse(c10);
        catalog.addCourse(c11);
        d2.addCourse(c11);
        d3.addCourse(c11);
        d6.addCourse(c11);
        catalog.addCourse(c12);
        d4.addCourse(c12);
        catalog.addCourse(c13);
        d2.addCourse(c13);
        d4.addCourse(c13);
        catalog.addCourse(c14);
        d1.addCourse(c14);
        d4.addCourse(c14);
        catalog.addCourse(c15);
        d4.addCourse(c15);
        d6.addCourse(c15);
        catalog.addCourse(c16);
        d7.addCourse(c16);
        d8.addCourse(c16);
        catalog.addCourse(c17);
        d7.addCourse(c17);
        d8.addCourse(c17);
        catalog.addCourse(c18);
        d5.addCourse(c18);
        d8.addCourse(c18);
        catalog.addCourse(c19);
        d1.addCourse(c19);
        d8.addCourse(c19);

        f1.addDepartment(d1);
        f1.addDepartment(d2);
        f2.addDepartment(d3);
        f2.addDepartment(d4);
        f3.addDepartment(d5);
        f3.addDepartment(d6);
        f4.addDepartment(d7);
        f4.addDepartment(d8);

        catalog.addObserver(p1M);
        catalog.addObserver(p1F);
        catalog.addObserver(p2M);
        catalog.addObserver(p3M);
        catalog.addObserver(p4M);
        catalog.addObserver(p4F);
        catalog.addObserver(p7M);
        catalog.addObserver(p8F);


        HashMap<Teacher, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> examScores = new HashMap<>();
        HashMap<Assistant, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> partialScores = new HashMap<>();
        ArrayList<ScoreVisitor.Triplet<Student, String, Double>> ar1 = new ArrayList<>();
        ar1.add(new ScoreVisitor.Triplet(s3,"Limbajul C",3.6d));
        ar1.add(new ScoreVisitor.Triplet(students3.get(2),"Limbajul C",1.6d));
        ar1.add(new ScoreVisitor.Triplet(s6,"Limbajul C++",3.6d));
        ar1.add(new ScoreVisitor.Triplet(s6,"Limbajul Python",4.0d));
        examScores.put(t1, ar1);
        ArrayList<ScoreVisitor.Triplet<Student, String, Double>> ar2 = new ArrayList<>();
        ar2.add(new ScoreVisitor.Triplet(s1,"Limbajul HTML",3.6d));
        examScores.put(t2, ar2);

        ArrayList<ScoreVisitor.Triplet<Student, String, Double>> ar4 = new ArrayList<>();
        ar4.add(new ScoreVisitor.Triplet(s2,"Matematica",3.6d));
        ar4.add(new ScoreVisitor.Triplet(s3,"Matematica",4.6d));
        ar4.add(new ScoreVisitor.Triplet(s4,"Matematica",4.6d));
        partialScores.put(a4, ar4);

        catalog.setExamScores(examScores);
        catalog.setPartialScores(partialScores);


        University uni = new University("Universitatea de Codat", t4, catalog);
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.addFaculty(f3);
        uni.addFaculty(f4);

        ArrayList<Parent> parents = new ArrayList<>();
        parents.add(p1F);
        parents.add(p1M);
        parents.add(p2M);
        parents.add(p3F);
        parents.add(p3M);
        parents.add(p4F);
        parents.add(p4M);
        parents.add(p7F);
        parents.add(p7M);
        parents.add(p8F);
        parents.add(p8M);

        ArrayList<Student> students = new ArrayList<>();

        for (Student i : students1)
            students.add(i);
        for (Student i : students2)
            students.add(i);
        for (Student i : students3)
            students.add(i);
        for (Student i : students4)
            students.add(i);
        for (Student i : students5)
            students.add(i);
        for (Student i : students6)
            students.add(i);
        for (Student i : students7)
            students.add(i);
        for (Student i : students8)
            students.add(i);
        for (Student i : students11)
            students.add(i);
        for (Student i : students22)
            students.add(i);
        for (Student i : students32)
            students.add(i);
        for (Student i : students42)
            students.add(i);
        for (Student i : students52)
            students.add(i);
        for (Student i : students61)
            students.add(i);
        for (Student i : students71)
            students.add(i);
        for (Student i : students81)
            students.add(i);

        ArrayList<Assistant> assistants = new ArrayList<>();
        assistants.add(a1);
        assistants.add(a2);
        assistants.add(a3);
        assistants.add(a4);
        assistants.add(a5);

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);


        try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(uni);

            oos.close();
            fos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream("SURSE/infos/teachers.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(teachers);

            oos.close();
            fos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream("SURSE/infos/assistants.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(assistants);

            oos.close();
            fos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream("SURSE/infos/students.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(students);

            oos.close();
            fos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream("SURSE/infos/parents.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(parents);

            oos.close();
            fos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
