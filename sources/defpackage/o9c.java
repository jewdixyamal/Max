package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: o9c  reason: default package */
public final /* synthetic */ class o9c implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9c b;
    public final /* synthetic */ List c;

    public /* synthetic */ o9c(p9c p9c, List list, int i) {
        this.a = i;
        this.b = p9c;
        this.c = list;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                p9c p9c = this.b;
                p9c.getClass();
                return new sa3(1, new m9c(p9c, (d9c) obj, (ArrayList) this.c, 2));
            case 1:
                p9c p9c2 = this.b;
                p9c2.getClass();
                return new sa3(1, new m9c(p9c2, (OneMeRoomDatabase) obj, this.c, 0));
            default:
                p9c p9c3 = this.b;
                p9c3.getClass();
                return new sa3(1, new m9c(p9c3, (OneMeRoomDatabase) obj, (ArrayList) this.c, 1));
        }
    }
}
