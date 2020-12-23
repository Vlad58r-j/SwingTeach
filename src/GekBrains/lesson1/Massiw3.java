package GekBrains.lesson1;

public class Massiw3 {
    public static void main(String[] args) {
        char cells[][];
        cells = new char[4][4];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                cells[y][x] = '.';
            }
        }
        cells[0][1]='c';
        cells[1][1]='c';
        cells[2][1]='c';
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(" " + cells[y][x]);
            }
            System.out.println();
        }

//        System.out.println(Arrays.toString(cells));// не красиво
    }
}

// 0 1 2  - x
// . . . 0  }
// . o x 1  } y
// . . . 2  }
// . . . 3  }