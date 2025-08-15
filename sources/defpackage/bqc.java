package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsApiRequest;
import ru.ok.tamtam.nano.Protos;

/* renamed from: bqc  reason: default package */
public final /* synthetic */ class bqc implements grd, eqc, b7b, moc, qj3, o1d, i33, y2a, b66, rc7, pj3, za7, mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bqc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public x6g P(View view, x6g x6g) {
        yq0 yq0;
        g1e g1e = (g1e) this.b;
        if (g1e.g) {
            return x6g;
        }
        g1e.e = x6g;
        WindowInsets e = x6g.e();
        int i = 0;
        if (e != null) {
            if (Build.VERSION.SDK_INT < 31 || (yq0 = g1e.b.b) == null || !yq0.c) {
                e = null;
            }
            if (e != null) {
                RoundedCorner l = e.getRoundedCorner(3);
                int b2 = l != null ? l.getRadius() : 0;
                RoundedCorner B = e.getRoundedCorner(2);
                if (B != null) {
                    i = B.getRadius();
                }
                i = Math.max(b2 / 2, i / 2);
            }
        }
        g1e.f = i;
        g1e.c(x6g);
        return g1e.d(x6g);
    }

    public void a(hoc hoc, roc roc) {
        ehc ehc = (ehc) hoc;
        h7d h7d = (h7d) this.b;
        h7d.getClass();
        Integer num = ((fhc) roc).a;
        if (num != null) {
            h7d.D0.a.edit().putInt("estimatedPerformanceIndex", num.intValue()).apply();
        }
    }

    public void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 7:
                j10 j10 = (j10) obj;
                u10 u10 = j10.v;
                if (u10 == null) {
                    u10 = u10.j;
                }
                t10 a2 = u10.a();
                a2.a = (er7) obj2;
                j10.v = a2.a();
                j10.i = d20.c;
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                hm9.p("a4e", String.format(Locale.ENGLISH, "storeStickerSetsFromServer: failed for %s", new Object[]{(Collection) obj2}), (Throwable) obj);
                return;
            case 20:
                b04 b04 = (b04) obj;
                gbe gbe = (gbe) obj2;
                gbe.getClass();
                long j = b04.b;
                gbe.b.getClass();
                fbe fbe = new fbe(j, kj6.d(b04.c, b04.a));
                gbe.o.add(fbe);
                long j2 = gbe.v0;
                if (j2 == -9223372036854775807L || b04.b >= j2) {
                    gbe.a(fbe);
                    return;
                }
                return;
            case 21:
                ((ww6) obj2).a((b04) obj);
                return;
            default:
                hm9.p("vpe", "process: failed for text " + ((CharSequence) obj2), (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                Cursor cursor = (Cursor) obj;
                gqc gqc = (gqc) this.b;
                gqc.getClass();
                while (cursor.moveToNext()) {
                    gqc.U((long) cursor.getInt(0), rs7.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                return null;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                d2e d2e = (d2e) obj;
                o2e o2e = ((q2e) this.b).b;
                o2e.a.put(Long.valueOf(d2e.a), d2e);
                cqc.a(new p00(o2e, 11, d2e), o2e.h, (f6) null, new p4c(27), (ztc) null);
                return iqd.g(d2e);
            case 16:
                b4e b4e = (b4e) obj;
                b4e.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM sticker_sets WHERE id IN (");
                long[] jArr = (long[]) this.b;
                int length = jArr == null ? 1 : jArr.length;
                a14.c(sb, length);
                sb.append(")");
                xlc a2 = xlc.a(length, sb.toString());
                if (jArr == null) {
                    a2.W(1);
                } else {
                    int i = 1;
                    for (long j : jArr) {
                        a2.j(i, j);
                        i++;
                    }
                }
                return new t28(new uh(b4e, 27, a2));
            default:
                return ((qy9) obj).i(new dme((fme) this.b), Integer.MAX_VALUE);
        }
    }

    public boolean d(ClickableSpan clickableSpan, int i, int i2, String str, lk7 lk7, MotionEvent motionEvent) {
        switch (this.a) {
            case 11:
                i33 onLinkLongClickListener = ((xkd) this.b).getOnLinkLongClickListener();
                return onLinkLongClickListener != null && onLinkLongClickListener.d(clickableSpan, i, i2, str, lk7, motionEvent);
            default:
                i33 onLinkLongClickListener2 = ((ppe) this.b).getOnLinkLongClickListener();
                return onLinkLongClickListener2 != null && onLinkLongClickListener2.d(clickableSpan, i, i2, str, lk7, motionEvent);
        }
    }

    public int i(int i) {
        switch (this.a) {
            case 8:
                d1d d1d = (d1d) ((ol7) ((SettingMediaScreen) this.b).X.C(i));
                int a2 = d1d.a();
                if (d1d.g()) {
                    return a2;
                }
                return 0;
            case 9:
                z0d z0d = (z0d) ((ol7) ((SettingsPrivacyScreen) this.b).Y.C(i));
                int a3 = z0d.a();
                if (z0d.g()) {
                    return a3;
                }
                return 0;
            case 10:
                l1d l1d = (l1d) ((ol7) ((SettingsStorageScreen) this.b).c.C(i));
                int a4 = l1d.a();
                if (l1d.g()) {
                    return a4;
                }
                return 0;
            default:
                y0d y0d = (y0d) ((ol7) ((StickersSettingsScreen) this.b).X.C(i));
                if (y0d.a() != 0) {
                    return y0d.a();
                }
                return 0;
        }
    }

    public void j(nqd nqd) {
        switch (this.a) {
            case 0:
                nqd.a(((Callable) this.b).call());
                return;
            default:
                ((m56) ((vk8) this.b).e).invoke(new g0e(nqd));
                return;
        }
    }

    public Object parse(db7 db7) {
        return SupportedCodecsApiRequest._get_okParser_$lambda$0((SupportedCodecsApiRequest) this.b, db7);
    }

    public String q(lq1 lq1) {
        switch (this.a) {
            case 23:
                hee hee = (hee) this.b;
                hee.o = lq1;
                return "SettableFuture hashCode: " + hee.hashCode();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                ((kee) this.b).v0 = lq1;
                return "SurfaceOutputImpl close future complete";
            default:
                ((hre) this.b).k.set(lq1);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                r4d r4d = (r4d) obj;
                if (!nd7.c((Set) this.b, new bqc(5, r4d))) {
                    up7 up7 = r4d.a;
                    return !(up7 instanceof j00) && !up7.c.startsWith("content://");
                }
            case 5:
                return kp.e((Uri) obj, ((r4d) this.b).a.c());
            default:
                return ((wua) obj).Y == ((uj3) this.b).o();
        }
    }
}
