package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class WorkersQueueDao_Impl implements WorkersQueueDao {
    private final ilc __db;
    private final r25 __insertionAdapterOfWorkerQueueItem;
    private final r25 __insertionAdapterOfWorkerQueueItem_1;

    public WorkersQueueDao_Impl(ilc ilc) {
        this.__db = ilc;
        this.__insertionAdapterOfWorkerQueueItem = new x8g(this, ilc, 0);
        this.__insertionAdapterOfWorkerQueueItem_1 = new x8g(this, ilc, 1);
    }

    /* access modifiers changed from: private */
    public String __ExistingWorkPolicy_enumToString(h65 h65) {
        int ordinal = h65.ordinal();
        if (ordinal == 0) {
            return "REPLACE";
        }
        if (ordinal == 1) {
            return "KEEP";
        }
        if (ordinal == 2) {
            return "APPEND";
        }
        if (ordinal == 3) {
            return "APPEND_OR_REPLACE";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + h65);
    }

    private h65 __ExistingWorkPolicy_stringToEnum(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1086924163:
                if (str.equals("APPEND_OR_REPLACE")) {
                    c = 0;
                    break;
                }
                break;
            case 2302853:
                if (str.equals("KEEP")) {
                    c = 1;
                    break;
                }
                break;
            case 1812479636:
                if (str.equals("REPLACE")) {
                    c = 2;
                    break;
                }
                break;
            case 1937228570:
                if (str.equals("APPEND")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return h65.o;
            case 1:
                return h65.b;
            case 2:
                return h65.a;
            case 3:
                return h65.c;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public boolean contains(List<String> list) {
        this.__db.c();
        try {
            boolean contains = super.contains(list);
            this.__db.r();
            return contains;
        } finally {
            this.__db.l();
        }
    }

    public int count(int i) {
        xlc a = xlc.a(1, "SELECT COUNT(*) FROM WorkerQueueItem WHERE state = ?");
        a.j(1, (long) i);
        this.__db.b();
        Cursor o = this.__db.o(a, (CancellationSignal) null);
        try {
            int i2 = 0;
            if (o.moveToFirst()) {
                i2 = o.getInt(0);
            }
            return i2;
        } finally {
            o.close();
            a.n();
        }
    }

    public void delete(List<String> list) {
        this.__db.b();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM WorkerQueueItem WHERE uuid IN (");
        a14.c(sb, list.size());
        sb.append(")");
        q36 d = this.__db.d(sb.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                d.W(i);
            } else {
                d.f(i, next);
            }
            i++;
        }
        this.__db.c();
        try {
            d.n();
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public List<q8g> getItemsForRunning(int i) {
        this.__db.c();
        try {
            List<q8g> itemsForRunning = super.getItemsForRunning(i);
            this.__db.r();
            return itemsForRunning;
        } finally {
            this.__db.l();
        }
    }

    public void insert(q8g q8g) {
        this.__db.c();
        try {
            super.insert(q8g);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public void insertOrIgnore(q8g q8g) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfWorkerQueueItem.C(q8g);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public void insertOrReplace(q8g q8g) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfWorkerQueueItem_1.C(q8g);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public List<q8g> select(int i) {
        xlc xlc;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        byte[] bArr3;
        WorkersQueueDao_Impl workersQueueDao_Impl = this;
        xlc a = xlc.a(1, "SELECT * FROM WorkerQueueItem ORDER BY time ASC LIMIT ?");
        a.j(1, (long) i);
        workersQueueDao_Impl.__db.b();
        Cursor o = workersQueueDao_Impl.__db.o(a, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "uuid");
            int n2 = tfg.n(o, "uniqueWorkName");
            int n3 = tfg.n(o, "existingWorkPolicy");
            int n4 = tfg.n(o, "tags");
            int n5 = tfg.n(o, "time");
            int n6 = tfg.n(o, "state");
            int n7 = tfg.n(o, "work_spec_id");
            int n8 = tfg.n(o, "work_spec_state");
            int n9 = tfg.n(o, "work_spec_worker_class_name");
            int n10 = tfg.n(o, "work_spec_input_merger_class_name");
            int n11 = tfg.n(o, "work_spec_input");
            int n12 = tfg.n(o, "work_spec_output");
            int n13 = tfg.n(o, "work_spec_initial_delay");
            xlc = a;
            try {
                int n14 = tfg.n(o, "work_spec_interval_duration");
                int n15 = tfg.n(o, "work_spec_flex_duration");
                int n16 = tfg.n(o, "work_spec_run_attempt_count");
                int n17 = tfg.n(o, "work_spec_backoff_policy");
                int n18 = tfg.n(o, "work_spec_backoff_delay_duration");
                int n19 = tfg.n(o, "work_spec_last_enqueue_time");
                int n20 = tfg.n(o, "work_spec_minimum_retention_duration");
                int n21 = tfg.n(o, "work_spec_schedule_requested_at");
                int n22 = tfg.n(o, "work_spec_run_in_foreground");
                int n23 = tfg.n(o, "work_spec_out_of_quota_policy");
                int n24 = tfg.n(o, "work_spec_period_count");
                int n25 = tfg.n(o, "work_spec_generation");
                int n26 = tfg.n(o, "work_spec_required_network_type");
                int n27 = tfg.n(o, "work_spec_requires_charging");
                int n28 = tfg.n(o, "work_spec_requires_device_idle");
                int n29 = tfg.n(o, "work_spec_requires_battery_not_low");
                int n30 = tfg.n(o, "work_spec_requires_storage_not_low");
                int n31 = tfg.n(o, "work_spec_trigger_content_update_delay");
                int n32 = tfg.n(o, "work_spec_trigger_max_content_delay");
                int n33 = tfg.n(o, "work_spec_content_uri_triggers");
                int i7 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    if (o.isNull(n)) {
                        str = null;
                    } else {
                        str = o.getString(n);
                    }
                    if (o.isNull(n2)) {
                        str2 = null;
                    } else {
                        str2 = o.getString(n2);
                    }
                    h65 __ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(o.getString(n3));
                    if (o.isNull(n4)) {
                        str3 = null;
                    } else {
                        str3 = o.getString(n4);
                    }
                    HashSet l = lz7.l(str3);
                    long j = o.getLong(n5);
                    int i8 = o.getInt(n6);
                    if (o.isNull(n7)) {
                        str4 = null;
                    } else {
                        str4 = o.getString(n7);
                    }
                    m7g v = nu0.v(o.getInt(n8));
                    if (o.isNull(n9)) {
                        str5 = null;
                    } else {
                        str5 = o.getString(n9);
                    }
                    if (o.isNull(n10)) {
                        str6 = null;
                    } else {
                        str6 = o.getString(n10);
                    }
                    if (o.isNull(n11)) {
                        bArr = null;
                    } else {
                        bArr = o.getBlob(n11);
                    }
                    d24 a2 = d24.a(bArr);
                    if (o.isNull(n12)) {
                        bArr2 = null;
                    } else {
                        bArr2 = o.getBlob(n12);
                    }
                    d24 a3 = d24.a(bArr2);
                    int i9 = i7;
                    long j2 = o.getLong(i9);
                    int i10 = n14;
                    long j3 = o.getLong(i10);
                    n14 = i10;
                    int i11 = n15;
                    long j4 = o.getLong(i11);
                    n15 = i11;
                    int i12 = n16;
                    int i13 = o.getInt(i12);
                    n16 = i12;
                    int i14 = n17;
                    mf0 s = nu0.s(o.getInt(i14));
                    n17 = i14;
                    int i15 = n18;
                    long j5 = o.getLong(i15);
                    n18 = i15;
                    int i16 = n19;
                    long j6 = o.getLong(i16);
                    n19 = i16;
                    int i17 = n20;
                    long j7 = o.getLong(i17);
                    n20 = i17;
                    int i18 = n21;
                    long j8 = o.getLong(i18);
                    n21 = i18;
                    int i19 = n22;
                    if (o.getInt(i19) != 0) {
                        n22 = i19;
                        i2 = n23;
                        z = true;
                    } else {
                        n22 = i19;
                        i2 = n23;
                        z = false;
                    }
                    jna u = nu0.u(o.getInt(i2));
                    n23 = i2;
                    int i20 = n24;
                    int i21 = o.getInt(i20);
                    n24 = i20;
                    int i22 = n25;
                    int i23 = o.getInt(i22);
                    n25 = i22;
                    int i24 = n26;
                    int t = nu0.t(o.getInt(i24));
                    n26 = i24;
                    int i25 = n27;
                    if (o.getInt(i25) != 0) {
                        n27 = i25;
                        i3 = n28;
                        z2 = true;
                    } else {
                        n27 = i25;
                        i3 = n28;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        n28 = i3;
                        i4 = n29;
                        z3 = true;
                    } else {
                        n28 = i3;
                        i4 = n29;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        n29 = i4;
                        i5 = n30;
                        z4 = true;
                    } else {
                        n29 = i4;
                        i5 = n30;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        n30 = i5;
                        i6 = n31;
                        z5 = true;
                    } else {
                        n30 = i5;
                        i6 = n31;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    n31 = i6;
                    int i26 = n32;
                    long j10 = o.getLong(i26);
                    n32 = i26;
                    int i27 = n33;
                    if (o.isNull(i27)) {
                        bArr3 = null;
                    } else {
                        bArr3 = o.getBlob(i27);
                    }
                    n33 = i27;
                    arrayList.add(new q8g(str, str2, __ExistingWorkPolicy_stringToEnum, new h8g(str4, v, str5, str6, a2, a3, j2, j3, j4, new kj3(t, z2, z3, z4, z5, j9, j10, nu0.c(bArr3)), i13, s, j5, j6, j7, j8, z, u, i21, i23), l, j, i8));
                    workersQueueDao_Impl = this;
                    i7 = i9;
                }
                o.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public void updateState(int i, List<String> list) {
        this.__db.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE WorkerQueueItem SET state = ? WHERE uuid IN (");
        a14.c(sb, list.size());
        sb.append(")");
        q36 d = this.__db.d(sb.toString());
        d.j(1, (long) i);
        int i2 = 2;
        for (String next : list) {
            if (next == null) {
                d.W(i2);
            } else {
                d.f(i2, next);
            }
            i2++;
        }
        this.__db.c();
        try {
            d.n();
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public List<q8g> select(int i, int i2) {
        xlc xlc;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        byte[] bArr3;
        WorkersQueueDao_Impl workersQueueDao_Impl = this;
        xlc a = xlc.a(2, "SELECT * FROM WorkerQueueItem WHERE state = ? ORDER BY time ASC LIMIT ?");
        a.j(1, (long) i2);
        a.j(2, (long) i);
        workersQueueDao_Impl.__db.b();
        Cursor o = workersQueueDao_Impl.__db.o(a, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "uuid");
            int n2 = tfg.n(o, "uniqueWorkName");
            int n3 = tfg.n(o, "existingWorkPolicy");
            int n4 = tfg.n(o, "tags");
            int n5 = tfg.n(o, "time");
            int n6 = tfg.n(o, "state");
            int n7 = tfg.n(o, "work_spec_id");
            int n8 = tfg.n(o, "work_spec_state");
            int n9 = tfg.n(o, "work_spec_worker_class_name");
            int n10 = tfg.n(o, "work_spec_input_merger_class_name");
            int n11 = tfg.n(o, "work_spec_input");
            int n12 = tfg.n(o, "work_spec_output");
            int n13 = tfg.n(o, "work_spec_initial_delay");
            xlc = a;
            try {
                int n14 = tfg.n(o, "work_spec_interval_duration");
                int n15 = tfg.n(o, "work_spec_flex_duration");
                int n16 = tfg.n(o, "work_spec_run_attempt_count");
                int n17 = tfg.n(o, "work_spec_backoff_policy");
                int n18 = tfg.n(o, "work_spec_backoff_delay_duration");
                int n19 = tfg.n(o, "work_spec_last_enqueue_time");
                int n20 = tfg.n(o, "work_spec_minimum_retention_duration");
                int n21 = tfg.n(o, "work_spec_schedule_requested_at");
                int n22 = tfg.n(o, "work_spec_run_in_foreground");
                int n23 = tfg.n(o, "work_spec_out_of_quota_policy");
                int n24 = tfg.n(o, "work_spec_period_count");
                int n25 = tfg.n(o, "work_spec_generation");
                int n26 = tfg.n(o, "work_spec_required_network_type");
                int n27 = tfg.n(o, "work_spec_requires_charging");
                int n28 = tfg.n(o, "work_spec_requires_device_idle");
                int n29 = tfg.n(o, "work_spec_requires_battery_not_low");
                int n30 = tfg.n(o, "work_spec_requires_storage_not_low");
                int n31 = tfg.n(o, "work_spec_trigger_content_update_delay");
                int n32 = tfg.n(o, "work_spec_trigger_max_content_delay");
                int n33 = tfg.n(o, "work_spec_content_uri_triggers");
                int i8 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    if (o.isNull(n)) {
                        str = null;
                    } else {
                        str = o.getString(n);
                    }
                    if (o.isNull(n2)) {
                        str2 = null;
                    } else {
                        str2 = o.getString(n2);
                    }
                    h65 __ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(o.getString(n3));
                    if (o.isNull(n4)) {
                        str3 = null;
                    } else {
                        str3 = o.getString(n4);
                    }
                    HashSet l = lz7.l(str3);
                    long j = o.getLong(n5);
                    int i9 = o.getInt(n6);
                    if (o.isNull(n7)) {
                        str4 = null;
                    } else {
                        str4 = o.getString(n7);
                    }
                    m7g v = nu0.v(o.getInt(n8));
                    if (o.isNull(n9)) {
                        str5 = null;
                    } else {
                        str5 = o.getString(n9);
                    }
                    if (o.isNull(n10)) {
                        str6 = null;
                    } else {
                        str6 = o.getString(n10);
                    }
                    if (o.isNull(n11)) {
                        bArr = null;
                    } else {
                        bArr = o.getBlob(n11);
                    }
                    d24 a2 = d24.a(bArr);
                    if (o.isNull(n12)) {
                        bArr2 = null;
                    } else {
                        bArr2 = o.getBlob(n12);
                    }
                    d24 a3 = d24.a(bArr2);
                    int i10 = i8;
                    long j2 = o.getLong(i10);
                    int i11 = n14;
                    long j3 = o.getLong(i11);
                    n14 = i11;
                    int i12 = n15;
                    long j4 = o.getLong(i12);
                    n15 = i12;
                    int i13 = n16;
                    int i14 = o.getInt(i13);
                    n16 = i13;
                    int i15 = n17;
                    mf0 s = nu0.s(o.getInt(i15));
                    n17 = i15;
                    int i16 = n18;
                    long j5 = o.getLong(i16);
                    n18 = i16;
                    int i17 = n19;
                    long j6 = o.getLong(i17);
                    n19 = i17;
                    int i18 = n20;
                    long j7 = o.getLong(i18);
                    n20 = i18;
                    int i19 = n21;
                    long j8 = o.getLong(i19);
                    n21 = i19;
                    int i20 = n22;
                    if (o.getInt(i20) != 0) {
                        n22 = i20;
                        i3 = n23;
                        z = true;
                    } else {
                        n22 = i20;
                        i3 = n23;
                        z = false;
                    }
                    jna u = nu0.u(o.getInt(i3));
                    n23 = i3;
                    int i21 = n24;
                    int i22 = o.getInt(i21);
                    n24 = i21;
                    int i23 = n25;
                    int i24 = o.getInt(i23);
                    n25 = i23;
                    int i25 = n26;
                    int t = nu0.t(o.getInt(i25));
                    n26 = i25;
                    int i26 = n27;
                    if (o.getInt(i26) != 0) {
                        n27 = i26;
                        i4 = n28;
                        z2 = true;
                    } else {
                        n27 = i26;
                        i4 = n28;
                        z2 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        n28 = i4;
                        i5 = n29;
                        z3 = true;
                    } else {
                        n28 = i4;
                        i5 = n29;
                        z3 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        n29 = i5;
                        i6 = n30;
                        z4 = true;
                    } else {
                        n29 = i5;
                        i6 = n30;
                        z4 = false;
                    }
                    if (o.getInt(i6) != 0) {
                        n30 = i6;
                        i7 = n31;
                        z5 = true;
                    } else {
                        n30 = i6;
                        i7 = n31;
                        z5 = false;
                    }
                    long j9 = o.getLong(i7);
                    n31 = i7;
                    int i27 = n32;
                    long j10 = o.getLong(i27);
                    n32 = i27;
                    int i28 = n33;
                    if (o.isNull(i28)) {
                        bArr3 = null;
                    } else {
                        bArr3 = o.getBlob(i28);
                    }
                    n33 = i28;
                    arrayList.add(new q8g(str, str2, __ExistingWorkPolicy_stringToEnum, new h8g(str4, v, str5, str6, a2, a3, j2, j3, j4, new kj3(t, z2, z3, z4, z5, j9, j10, nu0.c(bArr3)), i14, s, j5, j6, j7, j8, z, u, i22, i24), l, j, i9));
                    workersQueueDao_Impl = this;
                    i8 = i10;
                }
                o.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a;
            o.close();
            xlc.n();
            throw th;
        }
    }
}
