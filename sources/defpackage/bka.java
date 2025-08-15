package defpackage;

import android.text.InputFilter;

/* renamed from: bka  reason: default package */
public final class bka extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ cka o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bka(cka cka, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = cka;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    Integer num = (Integer) obj2;
                    Integer num2 = (Integer) obj;
                    pq9 pq9 = qp4.u0;
                    cka cka = this.o;
                    cka.onThemeChanged(pq9.j(cka));
                    return;
                }
                return;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    String str = (String) obj;
                    this.o.a.setHint((String) obj2);
                    return;
                }
                return;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    InputFilter[] inputFilterArr = (InputFilter[]) obj;
                    this.o.a.setFilters((InputFilter[]) obj2);
                    return;
                }
                return;
            case 3:
                if (!tpa.f(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    pq9 pq92 = qp4.u0;
                    cka cka2 = this.o;
                    cka2.onThemeChanged(pq92.j(cka2));
                    return;
                }
                return;
            case 4:
                if (!tpa.f(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    pq9 pq93 = qp4.u0;
                    cka cka3 = this.o;
                    cka3.onThemeChanged(pq93.j(cka3));
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    aka aka = (aka) obj2;
                    aka aka2 = (aka) obj;
                    if (aka != null) {
                        pq9 pq94 = qp4.u0;
                        cka cka4 = this.o;
                        cka4.e(pq94.j(cka4), aka);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bka(Object obj, cka cka, int i) {
        super(9, obj);
        this.c = i;
        this.o = cka;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bka(cka cka) {
        super(9, (Object) "");
        this.c = 1;
        this.o = cka;
    }
}
