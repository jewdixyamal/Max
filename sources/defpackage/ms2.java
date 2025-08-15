package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;

/* renamed from: ms2  reason: default package */
public abstract /* synthetic */ class ms2 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "DIALOG";
        }
        if (i == 3) {
            return "CHAT";
        }
        if (i == 4) {
            return "CHANNEL";
        }
        if (i == 5) {
            return "GROUP_CHAT";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "BLOCK";
        }
        if (i == 2) {
            return "UNBLOCK";
        }
        if (i == 3) {
            return "REMOVE";
        }
        if (i == 4) {
            return "ADD";
        }
        if (i == 5) {
            return "UPDATE";
        }
        throw null;
    }

    public static int c(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int d(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static String e(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.F());
        return sb.toString();
    }

    public static ArrayList f(int i, HashMap hashMap, ArrayList arrayList, int i2, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static EnumMap g(float f, int i, EnumMap enumMap, du4 du4, kqe kqe) {
        enumMap.put(du4, ck4.a(ck4.b(i, f)));
        return kqe.e();
    }

    public static void h(float f, int i, EnumMap enumMap, du4 du4) {
        enumMap.put(du4, ck4.a(ck4.b(i, f)));
    }

    public static void i(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void j(long j, String str, String str2, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        sb.append(str2);
    }

    public static void k(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void l(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    public static EnumMap m(float f, int i, EnumMap enumMap, du4 du4, kqe kqe) {
        enumMap.put(du4, ck4.a(ck4.b(i, f)));
        return kqe.f();
    }

    public static /* synthetic */ String n(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "LDPI";
            case 2:
                return "MDPI";
            case 3:
                return "HDPI";
            case 4:
                return "XHDPI";
            case 5:
                return "XXHDPI";
            case 6:
                return "XXXHDPI";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "GROUP_CHAT" : "CHANNEL" : "CHAT" : "DIALOG" : "UNKNOWN";
    }
}
