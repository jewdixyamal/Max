package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: x9e  reason: default package */
public abstract class x9e extends c54 {
    public static String b0(String str) {
        List i0 = l6d.i0(w9e.G0(str));
        ArrayList arrayList = new ArrayList();
        for (Object next : i0) {
            if (!w9e.C0((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (!nd7.E(str2.charAt(i))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Integer num = (Integer) x53.r0(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        i0.size();
        int L = y53.L(i0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = i0.iterator();
        int i2 = 0;
        while (true) {
            String str3 = null;
            if (it2.hasNext()) {
                Object next2 = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str4 = (String) next2;
                    if (!(i2 == 0 || i2 == L) || !w9e.C0(str4)) {
                        str3 = w9e.r0(intValue, str4);
                    }
                    if (str3 != null) {
                        arrayList3.add(str3);
                    }
                    i2 = i3;
                } else {
                    y53.R();
                    throw null;
                }
            } else {
                StringBuilder sb = new StringBuilder(length2);
                x53.m0(arrayList3, sb, 0, (m56) null, 124);
                return sb.toString();
            }
        }
    }

    public static String c0(String str) {
        if (!w9e.C0("|")) {
            List i0 = l6d.i0(w9e.G0(str));
            int length = str.length();
            i0.size();
            int L = y53.L(i0);
            ArrayList arrayList = new ArrayList();
            Iterator it = i0.iterator();
            int i = 0;
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        String str3 = (String) next;
                        if (!(i == 0 || i == L) || !w9e.C0(str3)) {
                            int length2 = str3.length();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    i3 = -1;
                                    break;
                                } else if (!nd7.E(str3.charAt(i3))) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (i3 != -1 && str3.startsWith("|", i3)) {
                                str2 = str3.substring(i3 + 1);
                            }
                            if (str2 == null) {
                                str2 = str3;
                            }
                        }
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                        i = i2;
                    } else {
                        y53.R();
                        throw null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(length);
                    x53.m0(arrayList, sb, 0, (m56) null, 124);
                    return sb.toString();
                }
            }
        } else {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
    }
}
