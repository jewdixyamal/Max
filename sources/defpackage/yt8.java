package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b;
import com.my.tracker.MyTrackerConfig;
import java.util.Iterator;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import org.apache.http.util.LangUtils;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yt8  reason: default package */
public final /* synthetic */ class yt8 implements qj3, i33, b66, xha, b17, pv6, y2a, lde, MyTrackerConfig.Logger, grd, RTCStatsCollectorCallback, jw5, wu, o1d, hx0, mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yt8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void I(yha yha) {
        yha yha2 = yha.X;
        ta3 ta3 = (ta3) this.b;
        if (yha == yha2) {
            ((ua3) ta3).makeCompleting$kotlinx_coroutines_core(Boolean.TRUE);
            return;
        }
        ((ua3) ta3).makeCompleting$kotlinx_coroutines_core(Boolean.FALSE);
    }

    public x6g P(View view, x6g x6g) {
        switch (this.a) {
            case 9:
                dl9 dl9 = (dl9) this.b;
                ViewGroup viewGroup = dl9.Y;
                int b2 = x6g.b();
                if (viewGroup.getPaddingLeft() != b2) {
                    viewGroup.setPadding(b2, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                }
                ViewGroup viewGroup2 = dl9.Y;
                int c = x6g.c();
                if (viewGroup2.getPaddingRight() != c) {
                    viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), c, viewGroup2.getPaddingBottom());
                }
                return x6g;
            default:
                nl9 nl9 = (nl9) this.b;
                ViewGroup viewGroup3 = nl9.z0;
                int b3 = x6g.b();
                if (viewGroup3.getPaddingLeft() != b3) {
                    viewGroup3.setPadding(b3, viewGroup3.getPaddingTop(), viewGroup3.getPaddingRight(), viewGroup3.getPaddingBottom());
                }
                ViewGroup viewGroup4 = nl9.z0;
                int c2 = x6g.c();
                if (viewGroup4.getPaddingRight() != c2) {
                    viewGroup4.setPadding(viewGroup4.getPaddingLeft(), viewGroup4.getPaddingTop(), c2, viewGroup4.getPaddingBottom());
                }
                j47.o(nl9.z0, x6g.a());
                return x6g;
        }
    }

    public void a(long j, long j2, long j3) {
        yo4 yo4 = ((jnb) this.b).e;
        if (yo4 != null) {
            ((ro4) yo4).b((j == -1 || j == 0) ? -1.0f : (((float) j2) * 100.0f) / ((float) j), j, j2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [e20, java.lang.Object] */
    public void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                m20 m20 = (m20) obj;
                long n = ((p7b) ((au8) obj2).c).a.n();
                for (int i = 0; i < m20.b(); i++) {
                    tpa.K(m20, m20.d(i).r, new c10(n, 0));
                }
                return;
            case 7:
                j10 j10 = (j10) obj;
                int ordinal = ((l20) obj2).a.ordinal();
                if (ordinal == 2) {
                    x10 x10 = j10.b;
                    if (x10 == null) {
                        x10 = x10.w0;
                    }
                    w10 b2 = x10.b();
                    b2.g = null;
                    j10.b = new x10(b2);
                    return;
                } else if (ordinal == 3) {
                    h20 a2 = j10.c().a();
                    a2.a = 0;
                    a2.l = null;
                    j10.d = new k20(a2);
                    return;
                } else if (ordinal == 5) {
                    f20 f20 = j10.f;
                    if (f20 == null) {
                        f20 = f20.p;
                    }
                    ? obj3 = new Object();
                    long j = f20.a;
                    obj3.d = f20.b;
                    obj3.b = f20.c;
                    obj3.c = f20.d;
                    obj3.f = f20.e;
                    obj3.g = f20.f;
                    obj3.i = f20.g;
                    obj3.h = f20.h;
                    obj3.e = f20.i;
                    obj3.j = f20.j;
                    obj3.k = f20.k;
                    obj3.l = f20.l;
                    obj3.m = f20.m;
                    obj3.n = f20.n;
                    obj3.o = f20.o;
                    obj3.a = 0;
                    j10.f = obj3.a();
                    return;
                } else if (ordinal == 9) {
                    r10 a3 = j10.b().a();
                    a3.a = 0;
                    a3.d = null;
                    j10.r = new s10(a3);
                    return;
                } else {
                    return;
                }
            case 8:
                ((bq7) ((we8) obj2)).q(((Long) obj).longValue());
                return;
            case 16:
                ((pkg) obj2).o = (te0) obj;
                return;
            case LangUtils.HASH_SEED:
                ((jc6) obj2).getClass();
                hm9.p("jc6", "onError", (Throwable) obj);
                return;
            default:
                mpa mpa = (mpa) obj;
                RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) obj2;
                rangeSeekBarView.G0.append(((Long) mpa.a).longValue(), (Bitmap) mpa.b);
                rangeSeekBarView.invalidate();
                return;
        }
    }

    public bm7 apply(Object obj) {
        Void voidR = (Void) obj;
        return ((k8b) this.b).d.o();
    }

    public void b(c54 c54) {
        lw1 lw1;
        q8b q8b = (q8b) this.b;
        q8b.getClass();
        if ((c54 instanceof eag) && (lw1 = q8b.v0) != null) {
            eag eag = (eag) c54;
            if (lw1.h() && lw1.s) {
                kq0.e();
                gag gag = (gag) lw1.u.d();
                if (gag != null) {
                    float c = gag.c();
                    float f = eag.f;
                    lw1.o(Math.min(Math.max(c * (f > 1.0f ? z7b.f(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), gag.b()), gag.a()));
                }
            }
        }
    }

    public boolean d(ClickableSpan clickableSpan, int i, int i2, String str, lk7 lk7, MotionEvent motionEvent) {
        i33 i33 = ((dy8) this.b).o;
        if (i33 != null) {
            return i33.d(clickableSpan, i, i2, str, lk7, motionEvent);
        }
        return false;
    }

    public Widget e(String str, b bVar) {
        bc7[] bc7Arr = PickerChatsTabWidget.y0;
        PickerChatsTabWidget pickerChatsTabWidget = (PickerChatsTabWidget) this.b;
        pickerChatsTabWidget.getClass();
        bc7[] bc7Arr2 = PickerChatsTabWidget.y0;
        bc7 bc7 = bc7Arr2[0];
        String str2 = ((suc) pickerChatsTabWidget.a.a(pickerChatsTabWidget)).a;
        bc7 bc72 = bc7Arr2[1];
        boolean booleanValue = ((Boolean) pickerChatsTabWidget.b.a(pickerChatsTabWidget)).booleanValue();
        bc7 bc73 = bc7Arr2[2];
        PickerChatsListWidget pickerChatsListWidget = new PickerChatsListWidget(str, str2, (oa2) pickerChatsTabWidget.c.a(pickerChatsTabWidget), false, booleanValue, pickerChatsTabWidget.X, 8, (z84) null);
        pickerChatsListWidget.u0 = bVar;
        if (pickerChatsListWidget.isAttached()) {
            pickerChatsListWidget.p0().setRecycledViewPool(bVar);
        }
        return pickerChatsListWidget;
    }

    public void f(qv6 qv6) {
        i99 i99 = (i99) this.b;
        synchronized (i99.a) {
            i99.c++;
        }
        i99.d(qv6);
    }

    public Object get() {
        il9 il9 = (il9) this.b;
        il9.getClass();
        StringBuilder sb = new StringBuilder("    ");
        int i = jpc.C2;
        Context context = (Context) il9.b;
        sb.append(context.getString(i));
        SpannableString spannableString = new SpannableString(sb.toString());
        Drawable b2 = kt3.b(context, gpc.C);
        if (b2 != null) {
            b2.setBounds(0, 0, b2.getIntrinsicWidth(), b2.getIntrinsicHeight());
            b2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            spannableString.setSpan(new ImageSpan(b2), 0, 3, 17);
        }
        return spannableString;
    }

    public int i(int i) {
        int l = ((efb) ((ol7) ((ProfileChangeLinkScreen) this.b).Y.C(i))).l();
        if ((536870911 & l) == 2048) {
            return 0;
        }
        if (dy7.A(l)) {
            return 1;
        }
        if (dy7.C(l)) {
            return 2;
        }
        return dy7.B(l) ? 3 : 4;
    }

    public void j(nqd nqd) {
        ((qoa) this.b).d.invoke(new ooa(nqd));
    }

    public void log(int i, String str, Throwable th) {
        Object obj;
        if (i >= ((int) ((qyc) this.b).q(PmsKey.f90mytrackerloglevel, (long) 4))) {
            us7.c.getClass();
            Iterator it = us7.v0.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    obj = null;
                    break;
                }
                obj = u1Var.next();
                if (((us7) obj).a == i) {
                    break;
                }
            }
            us7 us7 = (us7) obj;
            if (us7 == null) {
                us7 = us7.o;
            }
            hm9.N(us7, "OneMeMyTracker", str, th);
        }
    }

    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        ((o1e) this.b).a(new n1e(rTCStatsReport));
    }

    public String q(lq1 lq1) {
        qt1 qt1 = (qt1) this.b;
        qt1.c = lq1;
        return "RequestCompleteListener[" + qt1 + "]";
    }

    public /* synthetic */ yt8(xu3 xu3, yec yec) {
        this.a = 27;
        this.b = xu3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, ky8] */
    /* JADX WARNING: type inference failed for: r2v2, types: [i20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, bu1] */
    /* renamed from: apply  reason: collision with other method in class */
    public Object m140apply(Object obj) {
        bu1 bu1;
        switch (this.a) {
            case 2:
                oy8 oy8 = (oy8) obj;
                ? obj2 = new Object();
                iy8 iy8 = (iy8) this.b;
                nw8 nw8 = iy8.a;
                i20 i20 = null;
                if (nw8 == null) {
                    bu1 = null;
                } else {
                    ? obj3 = new Object();
                    obj3.b = nw8.b;
                    obj3.a = nw8.a;
                    obj3.c = nw8.c;
                    bu1 = obj3;
                }
                obj2.a = bu1;
                obj2.c = iy8.c;
                obj2.b = iy8.b;
                obj2.d = iy8.d;
                ref ref = iy8.e;
                if (ref != null) {
                    ? obj4 = new Object();
                    obj4.c = ref.c;
                    obj4.b = ref.b;
                    obj4.a = ref.a;
                    obj4.d = ref.d;
                    i20 = obj4;
                }
                obj2.e = i20;
                oy8.getClass();
                return new sa3(2, new uh(oy8, 12, obj2));
            case 3:
                oy8 oy82 = (oy8) obj;
                nw8 nw82 = (nw8) this.b;
                long j = nw82.a;
                oy82.getClass();
                return new sa3(2, new my8(oy82, j, nw82.b, nw82.c));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new te0(new BitmapDrawable((Resources) this.b, (Bitmap) obj));
            case 26:
                d9c d9c = (d9c) obj;
                d9c.getClass();
                return new sa3(2, new uh(d9c, 22, (e9c) this.b));
            default:
                return (f28) this.b;
        }
    }
}
