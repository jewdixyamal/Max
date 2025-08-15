package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: f8d  reason: default package */
public final class f8d extends d8d {
    public final /* synthetic */ int b;
    public final Object c;

    public f8d() {
        this.b = 0;
        this.c = f8d.class.getName();
    }

    /* JADX INFO: finally extract failed */
    public final void x() {
        Object obj = this.c;
        switch (this.b) {
            case 0:
                jmc jmc = ((k24) ((c34) s().a.get())).f;
                crd crd = goe.b;
                hoe b2 = jmc.b();
                b2.getClass();
                xlc a = xlc.a(1, "SELECT * FROM tasks WHERE status = ?");
                b2.c.getClass();
                a.j(1, (long) 10);
                ilc ilc = b2.a;
                ilc.b();
                Cursor o = ilc.o(a, (CancellationSignal) null);
                try {
                    int n = tfg.n(o, "id");
                    int n2 = tfg.n(o, "type");
                    int n3 = tfg.n(o, "status");
                    int n4 = tfg.n(o, "fails_count");
                    int n5 = tfg.n(o, "depends_request_id");
                    int n6 = tfg.n(o, "dependency_type");
                    int n7 = tfg.n(o, "data");
                    int n8 = tfg.n(o, "created_time");
                    ArrayList arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        arrayList.add(new vne(o.getLong(n), b46.t(o.getInt(n2)), b46.r(o.getInt(n3)), o.getInt(n4), o.getLong(n5), o.getInt(n6), o.isNull(n7) ? null : o.getBlob(n7), o.getLong(n8)));
                    }
                    o.close();
                    a.n();
                    for (une une : jmc.c(arrayList)) {
                        hm9.m((String) obj, "mark processing task: " + une + " as failed", new Object[0]);
                        s().c(une.a);
                    }
                    return;
                } catch (Throwable th) {
                    o.close();
                    a.n();
                    throw th;
                }
            default:
                HashSet hashSet = new HashSet();
                Collection collection = (Collection) obj;
                if (collection == null || collection.contains(gx0.c)) {
                    hashSet.add(2);
                }
                if (collection == null || collection.contains(gx0.b)) {
                    hashSet.add(1);
                    hashSet.add(4);
                }
                if (true ^ hashSet.isEmpty()) {
                    vlc vlc = ((k24) o().a).c;
                    hj8 hj8 = new hj8(11);
                    vlc.getClass();
                    try {
                        ((OneMeRoomDatabase) vlc.a.m()).q(new v05((Object) vlc, (Object) hashSet, (Object) hj8, 29));
                        return;
                    } catch (Throwable th2) {
                        hm9.p("RoomMessagesDatabase", "Can't update attach by type", th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public f8d(HashSet hashSet) {
        this.b = 1;
        this.c = hashSet;
    }
}
