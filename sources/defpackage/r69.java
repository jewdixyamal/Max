package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: r69  reason: default package */
public final class r69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((r69) n((fi9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r69 r69 = new r69(continuation, this.Y);
        r69.X = obj;
        return r69;
    }

    public final Object o(Object obj) {
        Object[] objArr;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr2;
        long[] jArr3;
        long[] jArr4;
        int i2;
        int i3 = 1;
        od2.a0(obj);
        fi9 fi9 = (fi9) this.X;
        MessagesListWidget messagesListWidget = this.Y;
        bc7[] bc7Arr = MessagesListWidget.X0;
        fn5 fn5 = (fn5) messagesListWidget.B0.getValue();
        EndlessRecyclerView2 u0 = this.Y.u0();
        if (!fn5.s0) {
            fn5.s0 = true;
            u0.j(fn5);
            fn5.t0 = u0;
        }
        fn5 fn52 = (fn5) this.Y.B0.getValue();
        fn52.getClass();
        long[] jArr5 = fi9.b;
        Object[] objArr3 = fi9.c;
        long[] jArr6 = fi9.a;
        int length = jArr6.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr6[i4];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j) < 128) {
                            int i8 = (i4 << 3) + i7;
                            jArr4 = jArr6;
                            long j2 = jArr5[i8];
                            ow8 ow8 = (ow8) objArr3[i8];
                            fi9 fi92 = fn52.c;
                            if (fi92.d(j2) == null) {
                                g5a g5a = new g5a(fn52.a);
                                String str = ow8.b;
                                jArr3 = jArr5;
                                objArr2 = objArr3;
                                Long valueOf = Long.valueOf(ow8.a);
                                CharSequence charSequence = ow8.c;
                                if (charSequence == null) {
                                    charSequence = "";
                                }
                                g5a.b(oag.a(charSequence, valueOf), str);
                                int i9 = fn52.X;
                                g5a.setBounds(0, 0, i9, i9);
                                g5a.setCallback((en5) fn52.u0.getValue());
                                fi92.g(j2, g5a);
                            } else {
                                jArr3 = jArr5;
                                objArr2 = objArr3;
                            }
                            i2 = 8;
                        } else {
                            jArr4 = jArr6;
                            jArr3 = jArr5;
                            objArr2 = objArr3;
                            i2 = i5;
                        }
                        j >>= i2;
                        i7++;
                        i5 = i2;
                        i3 = 1;
                        jArr6 = jArr4;
                        jArr5 = jArr3;
                        objArr3 = objArr2;
                    }
                    jArr2 = jArr6;
                    jArr = jArr5;
                    objArr = objArr3;
                    i = i3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    jArr2 = jArr6;
                    jArr = jArr5;
                    objArr = objArr3;
                    i = i3;
                }
                if (i4 == length) {
                    break;
                }
                i4 += i;
                i3 = i;
                jArr6 = jArr2;
                jArr5 = jArr;
                objArr3 = objArr;
            }
        }
        String name = fn5.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, zr6.h(fn52.c.e, "avatars.size = "), (Throwable) null);
        }
        this.Y.u0().Y();
        return e5f.a;
    }
}
