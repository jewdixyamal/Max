package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: kc8  reason: default package */
public final class kc8 extends tdc {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public kc8(Context context, e11 e11, e11 e112) {
        this.f = e11;
        this.g = e112;
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = 50;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        View r;
        MessageModel L;
        View r2;
        switch (this.a) {
            case 0:
                int i3 = this.b;
                int i4 = this.c;
                if (i2 > 0) {
                    int i5 = this.e + i2;
                    this.e = i5;
                    if (i5 >= i4 || i2 >= i3) {
                        ((k56) this.g).invoke();
                        this.e = 0;
                        this.d = 0;
                        return;
                    }
                    return;
                } else if (i2 < 0) {
                    int i6 = this.d + i2;
                    this.d = i6;
                    if (Math.abs(i6) >= i4 || Math.abs(i2) >= i3) {
                        ((k56) this.f).invoke();
                        this.d = 0;
                        this.e = 0;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                LinearLayoutManager t = z7.t(recyclerView);
                if (t != null) {
                    this.b = t.W0();
                    int Y0 = t.Y0();
                    this.d = Y0;
                    int i7 = this.b;
                    if (i7 != -1 && Y0 != -1) {
                        if (i7 < this.c && (r2 = t.r(i7)) != null) {
                            r2.getLocalVisibleRect((Rect) this.f);
                            if (((float) ((Rect) this.f).height()) >= ((float) r2.getMeasuredHeight()) * 0.3f) {
                                this.c = this.b;
                            }
                        }
                        int i8 = this.d;
                        if (i8 > this.e && (r = t.r(i8)) != null) {
                            if (!r.getLocalVisibleRect((Rect) this.f) || ((float) ((Rect) this.f).height()) < ((float) r.getMeasuredHeight()) * 0.3f) {
                                this.d = t.X0();
                            }
                            int i9 = this.d;
                            boolean z = false;
                            if (i9 >= 0 && i9 < ((MessagesListWidget) this.g).A0.j() && (L = ((MessagesListWidget) this.g).A0.L(i9)) != null) {
                                String str = ((MessagesListWidget) this.g).a;
                                ir6 ir6 = hm9.m;
                                if (ir6 != null && ir6.c()) {
                                    us7 us7 = us7.X;
                                    String m = L.m();
                                    ir6.d(us7, str, "Try change last read message from listener, pos:" + i9 + ", msg:" + m, (Throwable) null);
                                }
                                z = ((MessagesListWidget) this.g).x0().I(L);
                            }
                            if (z) {
                                this.e = this.d;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Only linear layout manger supported");
        }
    }

    public kc8(MessagesListWidget messagesListWidget) {
        this.g = messagesListWidget;
        this.f = new Rect();
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }
}
