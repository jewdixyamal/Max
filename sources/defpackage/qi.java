package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: qi  reason: default package */
public final /* synthetic */ class qi implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj b;

    public /* synthetic */ qi(gj gjVar, int i) {
        this.a = i;
        this.b = gjVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((OneMeRoomDatabase) this.b.b.m()).t();
            case 1:
                return ((OneMeRoomDatabase) this.b.b.m()).u();
            default:
                return ((OneMeRoomDatabase) this.b.b.m()).L();
        }
    }
}
