package defpackage;

import android.database.Cursor;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: mje  reason: default package */
public final class mje {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public mje(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    /* JADX INFO: finally extract failed */
    public static final mje a(k36 k36, String str) {
        Throwable th;
        Map map;
        Throwable th2;
        Throwable th3;
        wbd wbd;
        wbd wbd2;
        Throwable th4;
        int i;
        int i2;
        String str2;
        lje lje;
        Throwable th5;
        k36 k362 = k36;
        String str3 = str;
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str3);
        String str4 = "`)";
        sb.append(str4);
        Cursor q0 = k362.q0(sb.toString());
        try {
            String str5 = "name";
            if (q0.getColumnCount() <= 0) {
                map = oz4.a;
                v3c.i(q0, (Throwable) null);
            } else {
                int columnIndex = q0.getColumnIndex(str5);
                int columnIndex2 = q0.getColumnIndex("type");
                int columnIndex3 = q0.getColumnIndex("notnull");
                int columnIndex4 = q0.getColumnIndex("pk");
                int columnIndex5 = q0.getColumnIndex("dflt_value");
                ky7 ky7 = new ky7();
                while (q0.moveToNext()) {
                    String string = q0.getString(columnIndex);
                    ky7.put(string, new ije(q0.getInt(columnIndex4), 2, string, q0.getString(columnIndex2), q0.getString(columnIndex5), q0.getInt(columnIndex3) != 0));
                }
                map = ky7.b();
                v3c.i(q0, (Throwable) null);
            }
            Cursor q02 = k362.q0("PRAGMA foreign_key_list(`" + str3 + str4);
            try {
                int columnIndex6 = q02.getColumnIndex("id");
                int columnIndex7 = q02.getColumnIndex("seq");
                int columnIndex8 = q02.getColumnIndex("table");
                int columnIndex9 = q02.getColumnIndex("on_delete");
                int columnIndex10 = q02.getColumnIndex("on_update");
                int columnIndex11 = q02.getColumnIndex("id");
                int columnIndex12 = q02.getColumnIndex("seq");
                int columnIndex13 = q02.getColumnIndex("from");
                int columnIndex14 = q02.getColumnIndex("to");
                kl7 l = j1e.l();
                while (q02.moveToNext()) {
                    l.add(new kje(q02.getString(columnIndex13), q02.getInt(columnIndex11), q02.getInt(columnIndex12), q02.getString(columnIndex14)));
                    map = map;
                    str5 = str5;
                    columnIndex11 = columnIndex11;
                    columnIndex12 = columnIndex12;
                    columnIndex13 = columnIndex13;
                }
                Map map2 = map;
                String str6 = str5;
                List w0 = x53.w0(j1e.d(l));
                q02.moveToPosition(-1);
                wbd wbd3 = new wbd();
                while (q02.moveToNext()) {
                    if (q02.getInt(columnIndex7) == 0) {
                        int i3 = q02.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object next : w0) {
                            List list = w0;
                            if (((kje) next).a == i3) {
                                arrayList3.add(next);
                            }
                            w0 = list;
                        }
                        List list2 = w0;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            kje kje = (kje) it.next();
                            arrayList.add(kje.c);
                            arrayList2.add(kje.o);
                        }
                        wbd3.add(new jje(q02.getString(columnIndex8), q02.getString(columnIndex9), q02.getString(columnIndex10), arrayList, arrayList2));
                        w0 = list2;
                    }
                }
                wbd a2 = z7.a(wbd3);
                v3c.i(q02, (Throwable) null);
                Cursor q03 = k362.q0("PRAGMA index_list(`" + str3 + str4);
                String str7 = str6;
                try {
                    int columnIndex15 = q03.getColumnIndex(str7);
                    int columnIndex16 = q03.getColumnIndex(HasExtraData.KEY_ORIGIN);
                    int columnIndex17 = q03.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        wbd2 = null;
                        v3c.i(q03, (Throwable) null);
                    } else {
                        wbd wbd4 = new wbd();
                        while (q03.moveToNext()) {
                            if ("c".equals(q03.getString(columnIndex16))) {
                                String string2 = q03.getString(columnIndex15);
                                boolean z = q03.getInt(columnIndex17) == 1;
                                Cursor q04 = k362.q0("PRAGMA index_xinfo(`" + string2 + str4);
                                try {
                                    int columnIndex18 = q04.getColumnIndex("seqno");
                                    int columnIndex19 = q04.getColumnIndex("cid");
                                    int columnIndex20 = q04.getColumnIndex(str7);
                                    int columnIndex21 = q04.getColumnIndex("desc");
                                    String str8 = str7;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        str2 = str4;
                                        i2 = columnIndex15;
                                        i = columnIndex16;
                                        th5 = null;
                                        v3c.i(q04, (Throwable) null);
                                        lje = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        str2 = str4;
                                        TreeMap treeMap2 = new TreeMap();
                                        while (q04.moveToNext()) {
                                            if (q04.getInt(columnIndex19) >= 0) {
                                                int i4 = q04.getInt(columnIndex18);
                                                int i5 = columnIndex15;
                                                String string3 = q04.getString(columnIndex20);
                                                int i6 = columnIndex21;
                                                String str9 = q04.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i7 = columnIndex16;
                                                treeMap.put(Integer.valueOf(i4), string3);
                                                treeMap2.put(Integer.valueOf(i4), str9);
                                                columnIndex15 = i5;
                                                columnIndex16 = i7;
                                                columnIndex21 = i6;
                                            }
                                        }
                                        i2 = columnIndex15;
                                        i = columnIndex16;
                                        lje = new lje(string2, z, x53.D0(treeMap.values()), x53.D0(treeMap2.values()));
                                        v3c.i(q04, (Throwable) null);
                                        th5 = null;
                                    }
                                    if (lje == null) {
                                        v3c.i(q03, th5);
                                        wbd = null;
                                        break;
                                    }
                                    wbd4.add(lje);
                                    k362 = k36;
                                    str7 = str8;
                                    str4 = str2;
                                    columnIndex15 = i2;
                                    columnIndex16 = i;
                                } catch (Throwable th6) {
                                    Throwable th7 = th6;
                                    v3c.i(q04, th4);
                                    throw th7;
                                }
                            }
                        }
                        wbd2 = z7.a(wbd4);
                        v3c.i(q03, (Throwable) null);
                    }
                    wbd = wbd2;
                    return new mje(str3, map2, a2, wbd);
                } catch (Throwable th8) {
                    Throwable th9 = th8;
                    v3c.i(q03, th3);
                    throw th9;
                }
            } catch (Throwable th10) {
                Throwable th11 = th10;
                v3c.i(q02, th2);
                throw th11;
            }
        } catch (Throwable th12) {
            Throwable th13 = th12;
            v3c.i(q0, th);
            throw th13;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mje)) {
            return false;
        }
        mje mje = (mje) obj;
        if (!tpa.f(this.a, mje.a) || !tpa.f(this.b, mje.b) || !tpa.f(this.c, mje.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = mje.d) == null) {
            return true;
        }
        return tpa.f(set2, set);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
