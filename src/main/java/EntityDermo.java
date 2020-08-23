public class EntityDemo {
    static EntityManagerFactory factory =
            Persistence.createEntytyManagerFactory("java6");
    static EntityManager em = faktory.crateEntityManager();
    static Scanner scanner = new Scanner(System.in);
    static int menu(){
        System.out.println("1.  Dodaj encję");
        System.out.println("2. Wyświetl wszystkie encje ");
        System.out.println("3. Edytuj encję ");
        System.out.println("4. Usuń encję ");
        System.out.println("0. Wyjście ");

        while(!scanner.hasNextInt()){
            System.out.println(("Wypisz numer polecenia !!!!");
            scanner.nextLine();
            return option;
        }
        static void printAllEntities(){
            List<Alcohole>list = em.createQuery("from Alcohol", Alcohol.class).getResultList();
            list.forEach(System.out::println);
        }
        static void addEntity(){

            Alcohol beer = new Alcohol();
            System.out.println("Podaj nazwę: ");
            String name = scanner.nextLine();
            System.out.println("Podaj kategorię; ");
            String category = scanner.nextLine();
            System.out.println("podaj zawartość :");
            float voltage = scanner.nextFloat();
            System.out.println("podaj pojemność: ");
            float capacity = scanner.nextFloat();

            beer.setId(1);
            beer.setCapality(new BigDecimal(0.75));
            beer.setName("kasztelan");
            beer.setVoltage(new BigDecimal(5.5));
            beer.setCategory("beer");
            em.getTransaction().begin();
            em.persist(beer);
            //em.flush();
            em.getTransaction().comnit();
            em.close();
        }
        static void deleteEntotu() {
            System.out.println("podaj id usuwanej encji: ");
            long id = scanner.nexInt();
            em.getTransaciton().begin();
            alcohol entity = em.find(Alcohol.class, id);
            em.remove(entity);
            em.getTransaction().commit();
        }
        public static void main (String [] args) {
            swich(nemu());{
                case 1:
                break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    deleteEntity();
                    break;
                case 0:
                    break;

            }
        }
    }

    public static void main(String[] args) {

        Alcohol beer = new Alcohol();

        beer.setCapality(new BigDecimal(0.75));
        beer.setName("kasztelan");
        beer.setVoltage(new BigDecimal(5.5));
        beer.setCategory("beer");
        em.getTransaction().begin();
        em.persist(beer);
        //em.flush();
        em.getTransaction().comnit();
        em.close();
    }

    }
}
