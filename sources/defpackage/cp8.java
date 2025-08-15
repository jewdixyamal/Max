package defpackage;

import one.me.members.list.MembersListWidget;

/* renamed from: cp8  reason: default package */
public final /* synthetic */ class cp8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MembersListWidget b;

    public /* synthetic */ cp8(MembersListWidget membersListWidget, int i) {
        this.a = i;
        this.b = membersListWidget;
    }

    public final Object invoke() {
        MembersListWidget membersListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MembersListWidget.D0;
                return a14.m(membersListWidget.n0().getContext());
            case 1:
                bc7[] bc7Arr2 = MembersListWidget.D0;
                k56 k56 = membersListWidget.o0().o;
                khe khe = new khe(new cp8(membersListWidget, 2));
                cp8 cp8 = new cp8(membersListWidget, 3);
                return new bp8(membersListWidget.b, membersListWidget.c, khe, membersListWidget.o, cp8, k56);
            case 2:
                bc7[] bc7Arr3 = MembersListWidget.D0;
                ko8 ko8 = ko8.a;
                khe d = ko8.getAccessor().d(kke.class);
                khe d2 = ko8.getAccessor().d(ds3.class);
                khe d3 = ko8.getAccessor().d(iy2.class);
                khe d4 = ko8.getAccessor().d(mc6.class);
                khe d5 = ko8.getAccessor().d(b0d.class);
                khe d6 = ko8.getAccessor().d(q33.class);
                khe d7 = ko8.getAccessor().d(xb9.class);
                long j = membersListWidget.b;
                e52 e52 = (e52) ((jz2) ((iy2) d3.getValue())).m(j).a.getValue();
                if (e52 == null) {
                    hm9.p(np8.class.getName(), ey8.i(j, "We're trying to create members loader for chat(#", ") without the chat in cache"), (Throwable) null);
                    return new kp8();
                }
                int c = e52.b.c();
                ek2 ek2 = membersListWidget.c;
                if (c > 99 || e52.I()) {
                    return new yl0(j, ek2, (kke) d.getValue(), d3, d2, d4, d7);
                }
                return new ltd(j, ek2, (q33) d6.getValue(), d3, d2, d5, (kke) d.getValue(), d7);
            default:
                bc7[] bc7Arr4 = MembersListWidget.D0;
                return membersListWidget.o0().c;
        }
    }
}
