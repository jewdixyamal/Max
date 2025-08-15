package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* renamed from: j6e  reason: default package */
public final class j6e extends ppd {
    public final /* synthetic */ int X = 1;
    public final m56 Y;
    public final Object Z;
    public final f66 s0;

    public j6e(ExecutorService executorService, l6c l6c, wz7 wz7, lwa lwa) {
        super(executorService);
        this.Z = l6c;
        this.Y = wz7;
        this.s0 = lwa;
    }

    public final void H(hqd hqd, int i) {
        switch (this.X) {
            case 0:
                super.r(hqd, i);
                if (hqd instanceof a1d) {
                    ((a1d) hqd).b((m6e) this.Y);
                }
                if (hqd instanceof s3e) {
                    s3e s3e = (s3e) hqd;
                    s3e.I0.setOnTouchListener(new rf1(s3e, (m6e) ((m56) this.s0)));
                    m56 m56 = (m56) this.Z;
                    View view = s3e.a;
                    if (m56 != null) {
                        view.setOnLongClickListener(new ad2(s3e, (m6e) m56));
                        return;
                    } else {
                        view.setOnLongClickListener((View.OnLongClickListener) null);
                        return;
                    }
                } else {
                    return;
                }
            default:
                ol7 ol7 = (ol7) C(i);
                k6c k6c = null;
                j6c j6c = ol7 instanceof j6c ? (j6c) ol7 : null;
                if (j6c != null) {
                    if (hqd instanceof k6c) {
                        k6c = (k6c) hqd;
                    }
                    if (k6c != null) {
                        k6c.A(j6c);
                        tu0.K(k6c.a, 300, new vu5((wz7) this.Y, 26, j6c));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public long k(int i) {
        switch (this.X) {
            case 1:
                return ((ol7) C(i)).getItemId();
            default:
                return super.k(i);
        }
    }

    public int l(int i) {
        switch (this.X) {
            case 1:
                return ((ol7) C(i)).l();
            default:
                return super.l(i);
        }
    }

    public final /* bridge */ /* synthetic */ void r(dec dec, int i) {
        switch (this.X) {
            case 0:
                H((hqd) dec, i);
                return;
            default:
                H((hqd) dec, i);
                return;
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                if (i == gja.g) {
                    return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
                }
                if (i == gja.m) {
                    return new i6e(viewGroup.getContext());
                }
                if (i == gja.h) {
                    return new i6e(viewGroup.getContext());
                }
                if (i == gja.s) {
                    TextView textView = new TextView(viewGroup.getContext());
                    float f = (float) 16;
                    textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), textView.getPaddingBottom());
                    i4f.u.b(textView, du4.b);
                    v3c.y(new v9(3, (Continuation) null, 27), textView);
                    return new az0(textView, 19);
                } else if (i == gja.r) {
                    return new s3e(viewGroup.getContext());
                } else {
                    String name = j6e.class.getName();
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        ir6.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), (Throwable) null);
                    }
                    return new az0(new View(viewGroup.getContext()), 20);
                }
            default:
                int i2 = apc.a;
                l6c l6c = (l6c) this.Z;
                if (i != i2) {
                    return new k6c(viewGroup.getContext(), l6c);
                }
                Context context = viewGroup.getContext();
                lwa lwa = new lwa(9, this);
                ImageView imageView = new ImageView(context);
                int G = tu0.G(((float) l6c.a()) * fk4.d().getDisplayMetrics().density);
                imageView.setLayoutParams(new pdc(G, G));
                tu0.K(imageView, 300, new m6(19, lwa));
                v3c.y(new j27(G, (Continuation) null, 1), imageView);
                return new az0(imageView, 10);
        }
    }

    public j6e(ExecutorService executorService, m6e m6e, m6e m6e2, m6e m6e3) {
        super(executorService);
        this.Y = m6e;
        this.Z = m6e2;
        this.s0 = m6e3;
    }
}
