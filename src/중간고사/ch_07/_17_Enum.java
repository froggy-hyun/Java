package 중간고사.ch_07;

public class _17_Enum {
    public static void main(String[] args) {
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);


        resolution = Resolution.FHD;
        switch (resolution) {
            case HD:
                System.out.println("HD");
                break;
            case FHD:
                System.out.println("FHD");
                break;
            case UHD:
                System.out.println("UHD");
                break;
        };

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }
    }
}

enum Resolution {
    HD, FHD, UHD
}
