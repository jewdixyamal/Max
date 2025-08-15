package defpackage;

/* renamed from: bl5  reason: default package */
public final class bl5 {
    public long a;
    public long b;
    public boolean c = false;
    public final al5 d;

    public bl5(al5 al5) {
        if (al5 != null) {
            this.d = al5;
        } else {
            this.d = new ig5(6);
        }
    }

    public static long a(String str) {
        String str2 = null;
        for (String str3 : str.split("\n")) {
            if (str3.startsWith("a=fingerprint")) {
                String[] split = str3.split(" ");
                if (split.length == 2) {
                    str2 = split[1];
                }
            }
        }
        if (str2 == null) {
            return -1;
        }
        String[] split2 = str2.split(":");
        long j = 0;
        for (int min = Math.min(7, split2.length - 1); min >= 0; min--) {
            j = (j << 8) | ((long) Integer.parseInt(split2[min], 16));
        }
        return j;
    }
}
