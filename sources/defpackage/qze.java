package defpackage;

import java.util.Arrays;

/* renamed from: qze  reason: default package */
public final class qze implements su0 {
    public static final hme X = new hme(13);
    public final int a;
    public final String b;
    public final oy5[] c;
    public int o;

    public qze(String str, oy5... oy5Arr) {
        int i = 1;
        np8.d(oy5Arr.length > 0);
        this.b = str;
        this.c = oy5Arr;
        this.a = oy5Arr.length;
        String str2 = oy5Arr[0].c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = oy5Arr[0].X | 16384;
        while (i < oy5Arr.length) {
            String str3 = oy5Arr[i].c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", i, oy5Arr[0].c, oy5Arr[i].c);
                return;
            } else if (i2 != (oy5Arr[i].X | 16384)) {
                b("role flags", i, Integer.toBinaryString(oy5Arr[0].X), Integer.toBinaryString(oy5Arr[i].X));
                return;
            } else {
                i++;
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        StringBuilder sb = new StringBuilder(rh4.e(rh4.e(str.length() + 78, str2), str3));
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        fm9.c("", new IllegalStateException(sb.toString()));
    }

    public final int a(oy5 oy5) {
        int i = 0;
        while (true) {
            oy5[] oy5Arr = this.c;
            if (i >= oy5Arr.length) {
                return -1;
            }
            if (oy5 == oy5Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qze.class != obj.getClass()) {
            return false;
        }
        qze qze = (qze) obj;
        return this.a == qze.a && this.b.equals(qze.b) && Arrays.equals(this.c, qze.c);
    }

    public final int hashCode() {
        if (this.o == 0) {
            this.o = rh4.d(527, 31, this.b) + Arrays.hashCode(this.c);
        }
        return this.o;
    }
}
