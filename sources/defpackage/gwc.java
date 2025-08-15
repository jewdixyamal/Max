package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: gwc  reason: default package */
public final class gwc extends u2 {
    public long[] X;
    public long c;
    public long[] o;

    public static Serializable a2(int i, yaf yaf) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(yaf.p()));
        }
        boolean z = true;
        if (i == 1) {
            if (yaf.v() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i == 2) {
            return c2(yaf);
        } else {
            if (i == 3) {
                HashMap hashMap = new HashMap();
                while (true) {
                    String c2 = c2(yaf);
                    int v = yaf.v();
                    if (v == 9) {
                        return hashMap;
                    }
                    Serializable a2 = a2(v, yaf);
                    if (a2 != null) {
                        hashMap.put(c2, a2);
                    }
                }
            } else if (i == 8) {
                return b2(yaf);
            } else {
                if (i == 10) {
                    int y = yaf.y();
                    ArrayList arrayList = new ArrayList(y);
                    for (int i2 = 0; i2 < y; i2++) {
                        Serializable a22 = a2(yaf.v(), yaf);
                        if (a22 != null) {
                            arrayList.add(a22);
                        }
                    }
                    return arrayList;
                } else if (i != 11) {
                    return null;
                } else {
                    Date date = new Date((long) Double.longBitsToDouble(yaf.p()));
                    yaf.I(2);
                    return date;
                }
            }
        }
    }

    public static HashMap b2(yaf yaf) {
        int y = yaf.y();
        HashMap hashMap = new HashMap(y);
        for (int i = 0; i < y; i++) {
            String c2 = c2(yaf);
            Serializable a2 = a2(yaf.v(), yaf);
            if (a2 != null) {
                hashMap.put(c2, a2);
            }
        }
        return hashMap;
    }

    public static String c2(yaf yaf) {
        int A = yaf.A();
        int i = yaf.b;
        yaf.I(A);
        return new String(yaf.a, i, A);
    }

    public final boolean Z1(long j, yaf yaf) {
        if (yaf.v() != 2 || !"onMetaData".equals(c2(yaf)) || yaf.c() == 0 || yaf.v() != 8) {
            return false;
        }
        HashMap b2 = b2(yaf);
        Object obj = b2.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.c = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = b2.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.o = new long[size];
                this.X = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.o = new long[0];
                        this.X = new long[0];
                    } else {
                        this.o[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.X[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.o = new long[0];
                this.X = new long[0];
            }
        }
        return false;
    }
}
