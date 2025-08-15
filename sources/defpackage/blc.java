package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: blc  reason: default package */
public final /* synthetic */ class blc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ elc b;

    public /* synthetic */ blc(elc elc, int i) {
        this.a = i;
        this.b = elc;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((OneMeRoomDatabase) this.b.a.m()).w();
            case 1:
                return ((OneMeRoomDatabase) this.b.a.m()).O();
            default:
                return ((OneMeRoomDatabase) this.b.a.m()).F();
        }
    }
}
