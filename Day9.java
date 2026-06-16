public class DAY9 {
    static class college implements AutoCloseable {
        college() {
            System.out.println("college");
        }

        @Override
        public void close() throws Exception {
            System.out.println(" college Close");
        }
    }

    static class department extends college {
        department() {
            System.out.println("department");
        }

        @Override
        public void close() throws Exception {
            System.out.println("department Close");
            super.close();
        }
    }

    static class section extends department {
        section() {
            System.out.println("section");
        }

        @Override
        public void close() throws Exception {
            System.out.println("section Close");
            super.close();
        }
    }

    static void main() throws Exception {
        (section section = new section() {
        }
    }
}

