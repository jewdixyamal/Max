package defpackage;

import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.http.client.methods.HttpDelete;

/* renamed from: v47  reason: default package */
public final class v47 {
    public static final String[] o = {"UPDATE", HttpDelete.METHOD_NAME, "INSERT"};
    public final ilc a;
    public final Map b;
    public final Map c;
    public final LinkedHashMap d;
    public final String[] e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public volatile boolean g;
    public volatile q36 h;
    public final w36 i;
    public final ph4 j;
    public final rqc k;
    public final Object l;
    public final Object m;
    public final re n;

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, w36] */
    public v47(ilc ilc, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.a = ilc;
        this.b = hashMap;
        this.c = hashMap2;
        int length = strArr.length;
        ? obj = new Object();
        obj.b = new long[length];
        obj.c = new boolean[length];
        obj.o = new int[length];
        this.i = obj;
        this.j = new ph4(ilc, 23);
        this.k = new rqc();
        this.l = new Object();
        this.m = new Object();
        this.d = new LinkedHashMap();
        int length2 = strArr.length;
        String[] strArr2 = new String[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.d.put(lowerCase, Integer.valueOf(i2));
            String str2 = (String) this.b.get(strArr[i2]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i2] = lowerCase;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase3 = ((String) entry.getValue()).toLowerCase(locale2);
            if (this.d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.d;
                linkedHashMap.put(lowerCase4, mz7.X(linkedHashMap, lowerCase3));
            }
        }
        this.n = new re(29, this);
    }

    public final void a(s47 s47) {
        t47 t47;
        boolean z;
        String[] d2 = d(s47.a);
        ArrayList arrayList = new ArrayList(d2.length);
        int length = d2.length;
        int i2 = 0;
        while (i2 < length) {
            String str = d2[i2];
            Integer num = (Integer) this.d.get(str.toLowerCase(Locale.US));
            if (num != null) {
                arrayList.add(num);
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
        }
        int[] C0 = x53.C0(arrayList);
        t47 t472 = new t47(s47, C0, d2);
        synchronized (this.k) {
            t47 = (t47) this.k.b(s47, t472);
        }
        if (t47 == null) {
            w36 w36 = this.i;
            int[] copyOf = Arrays.copyOf(C0, C0.length);
            synchronized (w36) {
                z = false;
                for (int i3 : copyOf) {
                    long[] jArr = (long[]) w36.b;
                    long j2 = jArr[i3];
                    jArr[i3] = 1 + j2;
                    if (j2 == 0) {
                        z = true;
                        w36.a = true;
                    }
                }
            }
            if (z) {
                ilc ilc = this.a;
                if (ilc.n()) {
                    f(ilc.h().getWritableDatabase());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.a.n()) {
            return false;
        }
        if (!this.g) {
            this.a.h().getWritableDatabase();
        }
        return this.g;
    }

    public final void c(s47 s47) {
        t47 t47;
        boolean z;
        synchronized (this.k) {
            t47 = (t47) this.k.c(s47);
        }
        if (t47 != null) {
            w36 w36 = this.i;
            int[] iArr = t47.b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            synchronized (w36) {
                z = false;
                for (int i2 : copyOf) {
                    long[] jArr = (long[]) w36.b;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        z = true;
                        w36.a = true;
                    }
                }
            }
            if (z) {
                ilc ilc = this.a;
                if (ilc.n()) {
                    f(ilc.h().getWritableDatabase());
                }
            }
        }
    }

    public final String[] d(String[] strArr) {
        wbd wbd = new wbd();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            Map map = this.c;
            if (map.containsKey(lowerCase)) {
                wbd.addAll((Collection) map.get(str.toLowerCase(locale)));
            } else {
                wbd.add(str);
            }
        }
        return (String[]) z7.a(wbd).toArray(new String[0]);
    }

    public final void e(k36 k36, int i2) {
        k36.U("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.e[i2];
        String[] strArr = o;
        for (int i3 = 0; i3 < 3; i3++) {
            String str2 = strArr[i3];
            StringBuilder sb = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb.append(i2);
            sb.append(" AND invalidated = 0; END");
            k36.U(sb.toString());
        }
    }

    public final void f(k36 k36) {
        ReentrantReadWriteLock.ReadLock readLock;
        if (!k36.m0()) {
            try {
                readLock = this.a.i.readLock();
                readLock.lock();
                synchronized (this.l) {
                    int[] o2 = this.i.o();
                    if (o2 == null) {
                        readLock.unlock();
                        return;
                    }
                    if (k36.n0()) {
                        k36.n();
                    } else {
                        k36.m();
                    }
                    try {
                        int length = o2.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int i4 = o2[i2];
                            int i5 = i3 + 1;
                            if (i4 == 1) {
                                e(k36, i3);
                            } else if (i4 == 2) {
                                String str = this.e[i3];
                                String[] strArr = o;
                                for (int i6 = 0; i6 < 3; i6++) {
                                    String str2 = strArr[i6];
                                    StringBuilder sb = new StringBuilder("DROP TRIGGER IF EXISTS ");
                                    sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
                                    k36.U(sb.toString());
                                }
                            }
                            i2++;
                            i3 = i5;
                        }
                        k36.r0();
                        k36.S();
                        readLock.unlock();
                    } finally {
                        k36.S();
                    }
                }
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        }
    }
}
