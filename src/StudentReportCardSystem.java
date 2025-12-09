import java.util.Scanner;

public class StudentReportCardSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //SCHOOL DETAILS
        System.out.print("Enter School Name: ");
        String schoolName = sc.nextLine();

        System.out.print("Enter Teacher Name: ");
        String teacherName = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        sc.nextLine();

        int STUDENTS = 2;

        //ARRAYS
        String[] name = new String[STUDENTS];
        double[] eng = new double[STUDENTS];
        double[] math = new double[STUDENTS];
        double[] hist = new double[STUDENTS];
        double[] geo = new double[STUDENTS];
        double[] sci = new double[STUDENTS];
        double[] prog = new double[STUDENTS];
        double[] total = new double[STUDENTS];
        char[] rank = new char[STUDENTS];

        //INPUT STUDENT RECORDS
        for (int i = 0; i < STUDENTS; i++) {
            System.out.println("\n---ENTER DETAILS FOR STUDENT " + (i + 1) + "---");
            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("English: ");
            eng[i] = sc.nextDouble();

            System.out.print("Math: ");
            math[i] = sc.nextDouble();

            System.out.print("History: ");
            hist[i] = sc.nextDouble();

            System.out.print("Geography: ");
            geo[i] = sc.nextDouble();

            System.out.print("Science: ");
            sci[i] = sc.nextDouble();

            System.out.print("Programming: ");
            prog[i] = sc.nextDouble();
            sc.nextLine();

            total[i] = eng[i] + math[i] + hist[i] + geo[i] + sci[i] + prog[i];

            // Assign rank
            if (total[i] >= 540) rank[i] = 'A';
            else if (total[i] >= 480) rank[i] = 'B';
            else if (total[i] >= 420) rank[i] = 'C';
            else if (total[i] >= 360) rank[i] = 'D';
            else rank[i] = 'F';
        }




        //COMPUTE STATISTICS
        double sumEng = 0, sumMath = 0, sumHist = 0, sumGeo = 0, sumSci = 0, sumProg = 0;
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        double sumTotal = 0;


        for (int i = 0; i < STUDENTS; i++) {
            sumEng += eng[i];
            sumMath += math[i];
            sumHist += hist[i];
            sumGeo += geo[i];
            sumSci += sci[i];
            sumProg += prog[i];
            sumTotal += total[i];

            switch (rank[i]) {
                case 'A':
                    countA++;
                    break;
                case 'B':
                    countB++;
                    break;
                case 'C':
                    countC++;
                    break;
                case 'D':
                    countD++;
                    break;
                case 'F':
                    countF++;
                    break;
                default:
                    // handle invalid grade
                    break;
            }
                               }

        //OUTPUT REPORT
        System.out.println("==================================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\tSchool Name: " + schoolName);
        System.out.println("\t\t\t\t\t\t\t\t\t\tTeacher: " + teacherName);
        System.out.println("\t\t\t\t\t\t\t\t\t\tGrade: " + grade);
        System.out.println("\t\t\t\t\t\t\t\t\t\tYear: " + year);

      /*  System.out.println("\t\t\t\t\t\t", "School Name:", schoolName);
        System.out.println("\t\t\t\t\t\t", "Teacher:", teacherName);
        System.out.println("\t\t\t\t\t\t", "Grade:", grade);
        System.out.println("\t\t\t\t\t\t", "Year:", year);*/
        System.out.println("===================================================================================================================");

    System.out.println("Student Name            English      Math       History     Geography   Science    Programming      Total     Rank");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < STUDENTS; i++) {

            System.out.printf(
                    "%-23s %.2f\t\t %.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2f\t\t%c%n",
                    name[i], eng[i], math[i], hist[i], geo[i], sci[i], prog[i], total[i], rank[i]
            );

        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("Totals:\t\t\t\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2f%n",
                sumEng, sumMath, sumHist, sumGeo, sumSci, sumProg, sumTotal);

        System.out.printf("Averages:\t\t\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2f%n",
                sumEng / STUDENTS,sumMath / STUDENTS, sumHist / STUDENTS,sumGeo / STUDENTS, sumSci / STUDENTS, sumProg / STUDENTS, sumTotal / STUDENTS);
        System.out.println("====================================================================================================================");

        System.out.println("\t\t\t\t\t\tRanks  " + "A's: " + countA + "   B's: " + countB + "   C's: " + countC + "   D's: " + countD + "   F's: " + countF);}
}



/*School Name: Ronald Reagan High School
Teacher: Mr.Paul Swatz
Grade: 10
Year: 2018

Alice Arnold        76.00   65.00   91.00   89.00   98.00   100.00   519.00   B
Cory Brown          67.00   88.00   87.80   67.90   60.90   69.00    441.50   C
Sean Douglas        90.00   99.00   91.00   87.00   88.90   88.90    536.80   B
Pete Douglas        87.90   80.90   98.00   97.00   91.00   93.00    547.80   A
Mary Fleming        95.80   93.00   95.00   93.00   91.00   94.00    561.80   A
Joel Jacob          73.00   90.00   54.00   74.00   65.00   56.00    412.00   D
Jeramy Ghous        74.00   81.00   74.00   90.00   76.00   45.00    440.00   C
Hansie Holder       76.00   34.00   98.00   76.00   47.00   67.00    398.00   D
Loyola Ingenious    98.00   87.90   91.00   89.00   90.00   94.00    549.90   A
Gary Jackson        45.60   90.00   65.00   87.00   78.00   75.90    441.50   C
Russell Jacobson    68.00   69.00   87.80   85.90   98.70   87.60    497.00   B
Dustan Kellart      56.90   87.70   89.80   89.60   87.60   68.00    479.60   C
Carl Melone         93.00   97.00   90.00   91.00   88.00   59.50    518.50   B
Samuel Peterson     78.00   64.00   23.70   34.90   69.00   78.90    348.50   F
Alec Stewart        75.00   79.00   77.00   93.60   78.00   81.00    483.60   B

 */