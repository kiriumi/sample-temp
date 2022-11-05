package jp.example;

public class Main {

    public static void main(String[] args) {

        Dto dto = new Dto();
        System.out.println(dto.getId() + ", " + dto.getName());

        daoMethod(dto);

        System.out.println(dto.getId() + ", " + dto.getName());
    }

    private static void daoMethod(Dto dto) {

        dto = select();
    }

    private static Dto select() {

        Dto dto = new Dto();
        dto.setId(100);
        dto.setName("ほげ");

        return dto;
    }

}
