package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: m9c  reason: default package */
public final /* synthetic */ class m9c implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9c b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ List d;

    public /* synthetic */ m9c(p9c p9c, Object obj, List list, int i) {
        this.a = i;
        this.b = p9c;
        this.c = obj;
        this.d = list;
    }

    public final void run() {
        Object obj = this.c;
        List list = this.d;
        p9c p9c = this.b;
        switch (this.a) {
            case 0:
                p9c.getClass();
                OneMeRoomDatabase oneMeRoomDatabase = (OneMeRoomDatabase) obj;
                oneMeRoomDatabase.q(new v05((Object) p9c, (Object) oneMeRoomDatabase, (Object) list, 24));
                return;
            case 1:
                p9c.getClass();
                ((OneMeRoomDatabase) obj).q(new do9(p9c, 25, (ArrayList) list));
                return;
            default:
                long n = ((hyc) p9c.b).n();
                ArrayList arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(l9c.a((h9c) list.get(i), n - ((long) i)));
                }
                d9c d9c = (d9c) obj;
                ilc ilc = d9c.a;
                ilc.c();
                try {
                    new qa3(new sa3(2, new ia4(11, d9c)), 0, new sa3(2, new c9c(d9c, arrayList, 0))).a();
                    ilc.r();
                    return;
                } finally {
                    ilc.l();
                }
        }
    }
}
