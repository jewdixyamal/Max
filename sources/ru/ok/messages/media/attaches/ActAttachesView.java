package ru.ok.messages.media.attaches;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;
import ru.ok.messages.media.chat.FrgChatMediaLoader;
import ru.ok.messages.messages.widgets.Chronometer;
import ru.ok.messages.secret.widgets.TimerView;

public class ActAttachesView extends r5 implements n46, yf2, nwe, xe8 {
    public static final HashSet z1 = new HashSet(Arrays.asList(new g20[]{g20.c, g20.o}));
    public final ArrayList V0 = new ArrayList();
    public s20 W0;
    public View X0;
    public TextView Y0;
    public TextView Z0;
    public ImageButton a1;
    public boolean b1 = false;
    public boolean c1 = false;
    public boolean d1 = false;
    public boolean e1 = false;
    public ViewPager f1;
    public String g1;
    public String h1;
    public FrgChatMediaLoader i1;
    public View j1;
    public TextView k1;
    public RelativeLayout l1;
    public sh0 m1;
    public FrameLayout n1;
    public TimerView o1;
    public Chronometer p1;
    public ai3 q1;
    public int r1;
    public View s1;
    public View t1;
    public tg u1;
    public we8 v1;
    public we8 w1;
    public ad x1;
    public cl8 y1;

    public final void U() {
        super.U();
        if (this.c1) {
            a D = S().D(xxb.act_attachments_view__fl_transition);
            xw8 xw8 = (xw8) getIntent().getParcelableExtra("ru.ok.tamtam.extra.START_MESSAGE");
            k0(D, xw8 != null ? xw8.a : null);
        }
    }

    public final String Z() {
        return "MEDIA_VIEWER";
    }

    public final ai3 a() {
        return this.q1;
    }

    public final we8 b() {
        if (this.v1 == null) {
            ye8 k = ((y8a) ((ed3) this.K0.b)).k();
            getIntent().getBooleanExtra("ru.ok.tamtam.extra.CAST_ENABLED", true);
            this.v1 = k.n(ze8.c, new x50(true, false, true));
        }
        return this.v1;
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        this.b1 = z;
        if (z) {
            g0((View.OnSystemUiVisibilityChangeListener) null);
        } else {
            b0((View.OnSystemUiVisibilityChangeListener) null);
        }
        t0(z2, z3);
    }

    public final void c0(int i, int i2, Intent intent) {
        sh0 sh0 = this.m1;
        if (i == sh0.b) {
            sh0.getClass();
        }
    }

    public final void e() {
        boolean z = !this.b1;
        this.b1 = z;
        c(z, true, false);
    }

    public final boolean f() {
        return this.b1;
    }

    public final we8 i() {
        if (this.w1 == null) {
            this.w1 = ((y8a) ((ed3) this.K0.b)).k().n(ze8.a, new x50(false, true, true));
        }
        return this.w1;
    }

    public final void k0(a aVar, es8 es8) {
        hm9.m("ru.ok.messages.media.attaches.ActAttachesView", "endTransition: start", new Object[0]);
        if (isFinishing() || !this.P0) {
            this.c1 = true;
            return;
        }
        findViewById(xxb.act_attachments_view__fl_transition).setVisibility(8);
        if (aVar != null) {
            n16 S = S();
            S.getClass();
            he0 he0 = new he0(S);
            he0.h(aVar);
            he0.d(false);
        }
        hm9.m("ru.ok.messages.media.attaches.ActAttachesView", "endTransition: setPagerVisibility", new Object[0]);
        this.f1.setVisibility(0);
        FrgChatMediaLoader frgChatMediaLoader = this.i1;
        if (frgChatMediaLoader != null) {
            ArrayList arrayList = frgChatMediaLoader.B1.d;
            if (arrayList.size() > 0) {
                m0(arrayList);
            } else {
                m0(Collections.singletonList(es8));
            }
        }
        t0(true, false);
    }

    public final long l0() {
        return getIntent().getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0);
    }

    public final void m0(List list) {
        hm9.k("ru.ok.messages.media.attaches.ActAttachesView", "onLoadInitial: count=" + list.size());
        if (this.f1.getVisibility() == 0) {
            p0(list);
        }
    }

    public final void n0(es8 es8) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.V0;
            if (i >= arrayList.size()) {
                break;
            } else if (((es8) arrayList.get(i)).a.b == es8.a.b) {
                arrayList.set(i, es8);
                break;
            } else {
                i++;
            }
        }
        r0();
    }

    public final void o0() {
        if (this.v1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().r(this.v1);
            this.v1 = null;
        }
        if (this.w1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().r(this.w1);
            this.w1 = null;
        }
    }

    public final void onBackPressed() {
        o0();
        super.onBackPressed();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int indexOf;
        Toolbar toolbar;
        super.onConfigurationChanged(configuration);
        int i = this.r1;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.x1.d(i2, "ATTACHES_SCREEN_ORIENTATION_CHANGED");
        }
        this.r1 = configuration.orientation;
        this.d1 = true;
        ai3 ai3 = this.q1;
        if (!(ai3 == null || (toolbar = (Toolbar) ai3.b) == null)) {
            y7g y7g = (y7g) ai3.a;
            if (y7g.y() != null) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = fk4.a(y7g.y());
                toolbar.setLayoutParams(layoutParams);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = this.l1.getLayoutParams();
        layoutParams2.height = fk4.a(this);
        this.l1.setLayoutParams(layoutParams2);
        s20 s20 = this.W0;
        if (!(s20 == null || (indexOf = s20.j.indexOf(this.g1)) == -1)) {
            ViewPager viewPager = this.f1;
            viewPager.J0 = false;
            viewPager.v(indexOf, 0, false, false);
            r0();
        }
        nd7.R(new b(2, (Object) this), 300);
        s0();
    }

    public final void onCreate(Bundle bundle) {
        FrgAttachView frgAttachView;
        TransitionSet transitionSet;
        boolean z;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.v1 = b();
        this.w1 = i();
        if (bundle2 != null) {
            bq7 bq7 = (bq7) this.v1;
            bq7.h = bundle2.getFloat(bq7.b("MediaPlayerController.Volume"));
            bq7.i = bundle2.getBoolean(bq7.b("MediaPlayerController.Looping"));
            bq7.j = bundle2.getBoolean(bq7.b("MediaPlayerController.PlayWhenReady"));
            bq7 bq72 = (bq7) this.w1;
            bq72.h = bundle2.getFloat(bq72.b("MediaPlayerController.Volume"));
            bq72.i = bundle2.getBoolean(bq72.b("MediaPlayerController.Looping"));
            bq72.j = bundle2.getBoolean(bq72.b("MediaPlayerController.PlayWhenReady"));
        }
        this.u1 = ((y8a) ((ed3) this.K0.b)).c();
        this.x1 = ((y8a) ((ed3) this.K0.b)).b();
        this.r1 = getResources().getConfiguration().orientation;
        this.q1 = j0(yyb.act_attachments_view);
        findViewById(xxb.act_attachments_view__fl_root);
        go9 go9 = new go9(new y7g((im) this), (Toolbar) findViewById(xxb.toolbar));
        go9.c = u();
        ai3 ai3 = new ai3(go9);
        this.q1 = ai3;
        c5 c5Var = new c5(0, (Object) this);
        Toolbar toolbar = (Toolbar) ai3.b;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(c5Var);
        }
        ai3 ai32 = this.q1;
        int i = gpc.k;
        int i2 = ((sme) ai32.c).w;
        Toolbar toolbar2 = (Toolbar) ai32.b;
        if (toolbar2 != null) {
            toolbar2.setNavigationIcon(i);
            Drawable navigationIcon = toolbar2.getNavigationIcon();
            if (navigationIcon != null) {
                ngg.G(navigationIcon, i2);
            }
        }
        ai3 ai33 = this.q1;
        int i3 = ((bk4) this.K0.c).a;
        Toolbar toolbar3 = (Toolbar) ai33.b;
        if (toolbar3 != null) {
            WeakHashMap weakHashMap = zmf.a;
            omf.s(toolbar3, (float) i3);
        }
        ViewPager viewPager = (ViewPager) findViewById(xxb.act_attachments_view__vp_pager);
        this.f1 = viewPager;
        viewPager.b(new i5(this, 0));
        this.X0 = findViewById(xxb.act_attachments_view__rl_info);
        this.t1 = findViewById(xxb.act_attachments_view__info_separator);
        this.l1 = (RelativeLayout) this.X0.findViewById(xxb.act_attachments_view__rl_author);
        this.Y0 = (TextView) findViewById(xxb.act_attachments_view__tv_author);
        this.Z0 = (TextView) findViewById(xxb.act_attachments_view__tv_date);
        ImageButton imageButton = (ImageButton) findViewById(xxb.act_attachments_view__iv_forward);
        this.a1 = imageButton;
        nd7.h(imageButton, new e5(0, this));
        this.j1 = findViewById(xxb.act_attachments_view__fl_caption);
        this.k1 = (TextView) findViewById(xxb.act_attachments_view__tv_caption);
        this.s1 = findViewById(xxb.act_attachments_view__caption_divider);
        this.n1 = (FrameLayout) findViewById(xxb.act_attachments_view__fl_timer);
        this.o1 = (TimerView) findViewById(xxb.act_attachments_view__timer);
        this.p1 = (Chronometer) findViewById(xxb.act_attachments_view__chrono);
        this.X0.setBackgroundColor(this.y1.m);
        this.a1.setColorFilter(this.y1.w);
        this.a1.setBackground(this.y1.a());
        int i4 = this.y1.F;
        this.k1.setTextColor(i4);
        this.s1.setBackgroundColor(this.y1.K);
        this.Y0.setTextColor(i4);
        this.Z0.setTextColor(i4);
        ai3 ai34 = this.q1;
        cl8 cl8 = this.y1;
        ai34.c = cl8;
        ngg.g(cl8, ((Toolbar) ai34.b).getMenu(), (Integer) null);
        ngg.i(cl8, (Toolbar) ai34.b, (TextView) ai34.o, (TextView) ai34.X, cl8.F, cl8.M);
        f0(u().L);
        this.t1.setBackgroundColor(this.y1.K);
        View view = this.X0;
        d5 d5Var = new d5(this);
        WeakHashMap weakHashMap2 = zmf.a;
        omf.u(view, d5Var);
        mmf.c(this.X0);
        xw8 xw8 = (xw8) getIntent().getParcelableExtra("ru.ok.tamtam.extra.START_MESSAGE");
        es8 es8 = xw8 != null ? xw8.a : null;
        if (es8 == null) {
            finish();
            return;
        }
        long l0 = l0();
        boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false);
        cu8 cu8 = es8.a;
        if (!booleanExtra) {
            FrgChatMediaLoader frgChatMediaLoader = (FrgChatMediaLoader) S().E("photo_video");
            this.i1 = frgChatMediaLoader;
            if (frgChatMediaLoader == null) {
                long j = cu8.b;
                Long valueOf = Long.valueOf(j);
                HashSet hashSet = ql8.d;
                boolean booleanExtra2 = getIntent().getBooleanExtra("ru.ok.tamtam.extra.DESC_ORDER", false);
                hm9.m("ru.ok.messages.media.chat.FrgChatMediaLoader", "newInstance: chatId = %d, initialMessageId = %d, descOrder = %b", Long.valueOf(l0), valueOf, Boolean.valueOf(booleanExtra2));
                FrgChatMediaLoader frgChatMediaLoader2 = new FrgChatMediaLoader();
                Bundle bundle3 = new Bundle();
                bundle3.putLong("ru.ok.tamtam.extra.CHAT_ID", l0);
                bundle3.putBoolean("ru.ok.tamtam.extra.DESC_ORDER", booleanExtra2);
                bundle3.putIntegerArrayList("ru.ok.tamtam.extra.TYPES", new ArrayList(hashSet));
                bundle3.putLong("ru.ok.tamtam.extra.INITIAL_MESSAGE_ID", j);
                frgChatMediaLoader2.X0(bundle3);
                this.i1 = frgChatMediaLoader2;
                n16 S = S();
                FrgChatMediaLoader frgChatMediaLoader3 = this.i1;
                S.getClass();
                he0 he0 = new he0(S);
                he0.f(0, frgChatMediaLoader3, "photo_video", 1);
                he0.d(false);
            }
        }
        if (bundle2 == null) {
            hm9.m("ru.ok.messages.media.attaches.ActAttachesView", "onCreate: savedInstanceState == null", new Object[0]);
            this.g1 = getIntent().getStringExtra("ru.ok.tamtam.extra.START_LOCAL_ID");
            this.h1 = getIntent().getStringExtra("ru.ok.tamtam.extra.PLAY_VIDEO_ID");
            if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.EXTRA_WITH_TRANSITION", false)) {
                k8g k8g = cu8.z0;
                l20 l20 = null;
                for (int i5 = 0; i5 < k8g.i(); i5++) {
                    if (k8g.h(i5).r.equals(getIntent().getStringExtra("ru.ok.tamtam.extra.START_LOCAL_ID"))) {
                        l20 = k8g.h(i5);
                    }
                }
                if (l20 == null) {
                    l20 = k8g.h(0);
                }
                if (l20.g()) {
                    c20 c20 = l20.g;
                    if (c20.a()) {
                        l20 = c20.g;
                    }
                }
                boolean N = s5c.N(l20);
                boolean f = l20.f();
                if (f || N) {
                    Bundle s12 = FrgAttachView.s1(l20, es8, true, false, getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_WITH_LOW_RES", false));
                    FrgAttachPhoto frgAttachPhoto = new FrgAttachPhoto();
                    frgAttachPhoto.X0(s12);
                    frgAttachView = frgAttachPhoto;
                } else {
                    Bundle s13 = FrgAttachView.s1(l20, es8, true, false, false);
                    s13.putBoolean("ru.ok.tamtam.extra.PLAY_AT_START", false);
                    frgAttachView = new FrgAttachVideo();
                    frgAttachView.X0(s13);
                }
                frgAttachView.Z.putBoolean("ru.ok.tamtam.extra.COMPAT_MODE", getIntent().getBooleanExtra("ru.ok.tamtam.extra.COMPAT_MODE", false));
                dy7.e(S(), xxb.act_attachments_view__fl_transition, frgAttachView, "ru.ok.messages.media.attaches.fragments.FrgAttachPhoto");
                this.f1.setVisibility(8);
                this.X0.setVisibility(8);
                Toolbar toolbar4 = (Toolbar) this.q1.b;
                if (toolbar4 != null) {
                    toolbar4.setVisibility(8);
                }
                Rect rect = (Rect) getIntent().getParcelableExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_RECT");
                ssc ssc = ssc.o;
                ssc ssc2 = ssc.l;
                if (f || N) {
                    transitionSet = tq4.b(ssc2, l20.i() ? ssc2 : ssc);
                } else {
                    transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                }
                if (rect != null) {
                    z = true;
                    transitionSet.addTransition(new w33(rect, true));
                } else {
                    z = true;
                }
                if (!f || TextUtils.isEmpty(l20.b.t0)) {
                    z = false;
                }
                float[] floatArrayExtra = getIntent().getFloatArrayExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_CORNERS");
                if (floatArrayExtra != null && !z) {
                    transitionSet.addTransition(new oq4(floatArrayExtra, oq4.o));
                }
                transitionSet.addListener(new g5(this, frgAttachView, es8));
                setEnterSharedElementCallback(new h5(rect));
                transitionSet.setDuration(200);
                getWindow().setSharedElementEnterTransition(transitionSet);
                if (cu8.E()) {
                    ssc = ssc2;
                }
                TransitionSet b = tq4.b(ssc, ssc2);
                Rect rect2 = (Rect) getIntent().getParcelableExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_RECT");
                if (rect2 != null) {
                    b.addTransition(new w33(rect2, false));
                }
                float[] floatArrayExtra2 = getIntent().getFloatArrayExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_CORNERS");
                if (floatArrayExtra2 != null) {
                    b.addTransition(new oq4(oq4.o, floatArrayExtra2));
                }
                b.setDuration(200);
                getWindow().setSharedElementReturnTransition(b);
            }
        } else {
            this.g1 = bundle2.getString("ru.ok.tamtam.extra.START_LOCAL_ID");
            this.b1 = bundle2.getBoolean("ru.ok.tamtam.extra.UI_STATE");
            this.c1 = bundle2.getBoolean("ru.ok.tamtam.extra.EXTRA_FINISH_TRANSITION_ON_RESUME");
            t0(false, false);
        }
        if (this.i1 == null) {
            p0(Collections.singletonList(es8));
            q0(0);
            ((y8a) ((ed3) this.K0.b)).getClass();
            tp7 m = jyc.a.m();
            long j2 = cu8.b;
            m.getClass();
            tp7.b(m, j2, false, 2).m(muc.b()).i(ce.a()).k(new iq1(new d5(this), 2, new xw0(11)));
        }
        this.m1 = new sh0(987);
        c(false, false, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        o0();
    }

    @uae
    public void onEvent(re9 re9) {
        List list;
        boolean z;
        es8 es8;
        Object obj;
        if (this.P0 && re9.b == l0() && (list = re9.X) != null) {
            if (this.i1 == null) {
                int i = 0;
                while (i < this.W0.j.size()) {
                    mpa l = this.W0.l(i);
                    if (l == null || (obj = l.b) == null || !list.contains(Long.valueOf(((es8) obj).a.b))) {
                        i++;
                    } else {
                        a14.N(0, this, getString(jpc.z1));
                        overridePendingTransition(0, 0);
                        finish();
                        return;
                    }
                }
                return;
            }
            int currentItem = this.f1.getCurrentItem();
            Iterator it = list.iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Long l2 = (Long) it.next();
                FrgChatMediaLoader frgChatMediaLoader = this.i1;
                long longValue = l2.longValue();
                Iterator it2 = frgChatMediaLoader.B1.d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        es8 = null;
                        break;
                    }
                    es8 = (es8) it2.next();
                    if (es8.a.b == longValue) {
                        break;
                    }
                }
                if (es8 != null) {
                    if (es8.a.c == 0) {
                        z2 = true;
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
                FrgChatMediaLoader frgChatMediaLoader2 = this.i1;
                long longValue2 = l2.longValue();
                zf2 zf2 = frgChatMediaLoader2.B1;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = zf2.d;
                    if (i2 >= arrayList.size()) {
                        break;
                    } else if (((es8) arrayList.get(i2)).a.b == longValue2) {
                        arrayList.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (z2) {
                if (this.i1.B1.d.size() > 0) {
                    p0(this.i1.B1.d);
                    if (currentItem >= this.W0.j.size()) {
                        currentItem = this.W0.j.size() - 1;
                    }
                    mpa l3 = this.W0.l(currentItem);
                    if (l3 != null) {
                        String str = ((l20) l3.a).r;
                        this.g1 = str;
                        q0(currentItem);
                        ViewPager viewPager = this.f1;
                        viewPager.J0 = false;
                        viewPager.v(currentItem, 0, false, false);
                        z = !TextUtils.equals(str, this.g1);
                    } else {
                        z = false;
                    }
                } else {
                    overridePendingTransition(0, 0);
                    finish();
                }
                if (z) {
                    a14.N(0, this, getString(z3 ? jpc.i3 : jpc.z1));
                }
            }
        }
    }

    public final void onPause() {
        super.onPause();
        FrgChatMediaLoader frgChatMediaLoader = this.i1;
        if (frgChatMediaLoader != null) {
            frgChatMediaLoader.B1.o.remove(this);
        }
        if (this.v1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().o(this.v1);
        }
        if (this.w1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().o(this.w1);
        }
    }

    public final void onResume() {
        super.onResume();
        FrgChatMediaLoader frgChatMediaLoader = this.i1;
        if (frgChatMediaLoader != null) {
            if (!this.d1 && frgChatMediaLoader.B1.d.size() > 0 && this.i1.B1.d.size() != this.V0.size()) {
                m0(this.i1.B1.d);
            }
            this.d1 = false;
            this.i1.B1.o.add(this);
            if (this.i1.B1.k) {
                r0();
            }
        }
        s20 s20 = this.W0;
        if (s20 != null) {
            if (s20.k.size() != 0) {
                s20 s202 = this.W0;
                a aVar = (a) s202.g.get(s202.h(this.f1.getCurrentItem()));
                if (aVar instanceof FrgAttachVideo) {
                    ((FrgAttachVideo) aVar).F1();
                }
            }
            if (this.v1 != null) {
                ((y8a) ((ed3) this.K0.b)).k().l(this.v1);
            }
            if (this.w1 != null) {
                ((y8a) ((ed3) this.K0.b)).k().l(this.w1);
            }
            c(this.b1, false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = r6.W0.l(r6.f1.getCurrentItem());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSaveInstanceState(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onSaveInstanceState(r7)
            java.lang.String r0 = "ru.ok.tamtam.extra.UI_STATE"
            boolean r1 = r6.b1
            r7.putBoolean(r0, r1)
            s20 r0 = r6.W0
            if (r0 == 0) goto L_0x002c
            java.util.List r0 = r0.k
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0017
            goto L_0x002c
        L_0x0017:
            s20 r0 = r6.W0
            androidx.viewpager.widget.ViewPager r1 = r6.f1
            int r1 = r1.getCurrentItem()
            mpa r0 = r0.l(r1)
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r0.a
            l20 r0 = (defpackage.l20) r0
            java.lang.String r0 = r0.r
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            java.lang.String r1 = "ru.ok.tamtam.extra.START_LOCAL_ID"
            r7.putString(r1, r0)
            java.lang.String r0 = "ru.ok.tamtam.extra.EXTRA_FINISH_TRANSITION_ON_RESUME"
            boolean r1 = r6.c1
            r7.putBoolean(r0, r1)
            we8 r0 = r6.v1
            java.lang.String r1 = "MediaPlayerController.PlayWhenReady"
            java.lang.String r2 = "MediaPlayerController.Looping"
            java.lang.String r3 = "MediaPlayerController.Volume"
            if (r0 == 0) goto L_0x0060
            bq7 r0 = (defpackage.bq7) r0
            java.lang.String r4 = r0.b(r3)
            float r5 = r0.h
            r7.putFloat(r4, r5)
            java.lang.String r4 = r0.b(r2)
            boolean r5 = r0.i
            r7.putBoolean(r4, r5)
            java.lang.String r4 = r0.b(r1)
            boolean r0 = r0.j
            r7.putBoolean(r4, r0)
        L_0x0060:
            we8 r6 = r6.w1
            if (r6 == 0) goto L_0x0081
            bq7 r6 = (defpackage.bq7) r6
            java.lang.String r0 = r6.b(r3)
            float r3 = r6.h
            r7.putFloat(r0, r3)
            java.lang.String r0 = r6.b(r2)
            boolean r2 = r6.i
            r7.putBoolean(r0, r2)
            java.lang.String r0 = r6.b(r1)
            boolean r6 = r6.j
            r7.putBoolean(r0, r6)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.ActAttachesView.onSaveInstanceState(android.os.Bundle):void");
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        s20 s20 = this.W0;
        if (s20 != null) {
            for (WeakReference weakReference : s20.o.values()) {
                FrgAttachView frgAttachView = (FrgAttachView) weakReference.get();
                if (frgAttachView != null) {
                    frgAttachView.x1(z);
                }
            }
        }
    }

    public final void p0(List list) {
        int indexOf;
        if (!getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false)) {
            list = FrgChatMediaLoader.r1(list, z1);
        }
        if (this.W0 == null) {
            s20 s20 = new s20(S(), this.V0, this, getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_WITH_LOW_RES", false), getIntent().getBooleanExtra("ru.ok.tamtam.extra.COMPAT_MODE", false));
            this.W0 = s20;
            String str = this.h1;
            if (str != null) {
                s20.q = str;
                this.h1 = null;
            }
            this.f1.setAdapter(s20);
        }
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.EXTRA_WITH_TRANSITION", false) || getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false) || getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_COMPAT_VIDEO", false)) {
            this.W0.p = this.g1;
        }
        s20 s202 = this.W0;
        s202.k.clear();
        s202.j.clear();
        this.W0.j(list, true);
        this.W0.d();
        s20 s203 = this.W0;
        if (s203 != null && (indexOf = s203.j.indexOf(this.g1)) != -1) {
            ViewPager viewPager = this.f1;
            viewPager.J0 = false;
            viewPager.v(indexOf, 0, false, false);
            r0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0255, code lost:
        if (defpackage.sw8.c(r0, r3) != false) goto L_0x0259;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q0(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 1
            s20 r3 = r0.W0
            if (r3 == 0) goto L_0x025c
            mpa r3 = r3.l(r1)
            if (r3 == 0) goto L_0x025c
            java.lang.Object r4 = r3.b
            es8 r4 = (defpackage.es8) r4
            java.lang.Object r3 = r3.a
            l20 r3 = (defpackage.l20) r3
            boolean r5 = r0.e1
            if (r5 == 0) goto L_0x001d
            goto L_0x025c
        L_0x001d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "updateAttachInfo: position: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ru.ok.messages.media.attaches.ActAttachesView"
            defpackage.hm9.m(r6, r5, new java.lang.Object[0])
            ru.ok.messages.media.chat.FrgChatMediaLoader r5 = r0.i1
            g20 r6 = defpackage.g20.o
            if (r5 == 0) goto L_0x003c
            zf2 r5 = r5.B1
            boolean r5 = r5.k
            if (r5 != 0) goto L_0x0046
        L_0x003c:
            cu8 r5 = r4.a
            k8g r5 = r5.z0
            int r5 = r5.i()
            if (r5 <= r2) goto L_0x0075
        L_0x0046:
            ai3 r5 = r0.q1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r1 = r1 + r2
            r7.append(r1)
            java.lang.String r1 = " "
            r7.append(r1)
            int r8 = defpackage.dpc.B
            java.lang.String r8 = r0.getString(r8)
            r7.append(r8)
            r7.append(r1)
            s20 r1 = r0.W0
            java.util.ArrayList r1 = r1.j
            int r1 = r1.size()
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r5.g(r1)
            goto L_0x00a4
        L_0x0075:
            g20 r1 = r3.a
            g20 r5 = defpackage.g20.c
            if (r1 != r5) goto L_0x0087
            ai3 r1 = r0.q1
            int r5 = defpackage.jpc.q2
            java.lang.String r5 = r0.getString(r5)
            r1.g(r5)
            goto L_0x00a4
        L_0x0087:
            if (r1 != r6) goto L_0x0095
            ai3 r1 = r0.q1
            int r5 = defpackage.jpc.o3
            java.lang.String r5 = r0.getString(r5)
            r1.g(r5)
            goto L_0x00a4
        L_0x0095:
            g20 r5 = defpackage.g20.u0
            if (r1 != r5) goto L_0x00a4
            ai3 r1 = r0.q1
            int r5 = defpackage.jpc.e
            java.lang.String r5 = r0.getString(r5)
            r1.g(r5)
        L_0x00a4:
            y7g r1 = r0.K0
            java.lang.Object r1 = r1.b
            ed3 r1 = (defpackage.ed3) r1
            g20 r5 = r3.a
            r7 = 0
            r8 = 8
            if (r5 == r6) goto L_0x010d
            cu8 r5 = r4.a
            java.lang.String r5 = r5.s0
            boolean r5 = defpackage.oag.t(r5)
            if (r5 != 0) goto L_0x010d
            android.view.View r5 = r0.j1
            r5.setVisibility(r7)
            r5 = r1
            y8a r5 = (defpackage.y8a) r5
            p82 r5 = r5.e()
            long r9 = r20.l0()
            e52 r5 = r5.C(r9)
            u6b r9 = r4.X
            r9.f = r5
            ida r10 = r9.a
            int r11 = r10.f()
            int r10 = r10.e()
            r9.i(r5, r11, r10)
            java.lang.CharSequence r5 = r9.g
            android.text.SpannableStringBuilder r5 = android.text.SpannableStringBuilder.valueOf(r5)
            java.lang.String[] r9 = defpackage.are.b
            boolean r9 = r5 instanceof android.text.Spannable
            if (r9 == 0) goto L_0x0107
            boolean r9 = defpackage.oag.t(r5)
            if (r9 != 0) goto L_0x0107
            int r9 = r5.length()
            java.lang.Class<android.text.style.URLSpan> r10 = android.text.style.URLSpan.class
            java.lang.Object[] r9 = r5.getSpans(r7, r9, r10)
            int r10 = r9.length
            r11 = r7
        L_0x00fe:
            if (r11 >= r10) goto L_0x0107
            r12 = r9[r11]
            r5.removeSpan(r12)
            int r11 = r11 + r2
            goto L_0x00fe
        L_0x0107:
            android.widget.TextView r9 = r0.k1
            r9.setText(r5)
            goto L_0x0112
        L_0x010d:
            android.view.View r5 = r0.j1
            r5.setVisibility(r8)
        L_0x0112:
            g20 r5 = r3.a
            r9 = 0
            if (r5 != r6) goto L_0x015e
            d20 r5 = r3.o
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x015e
            k20 r5 = r3.d
            long r5 = r5.a
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x015e
            long r5 = r3.u
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x014d
            android.widget.TextView r1 = r0.Y0
            int r11 = defpackage.jpc.l3
            java.lang.String r11 = r0.getString(r11)
            long r12 = r3.v
            r3 = 0
            java.lang.String r12 = defpackage.are.w(r12, r7, r3)
            java.lang.String r3 = defpackage.are.w(r5, r7, r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r12, r3}
            java.lang.String r3 = java.lang.String.format(r11, r3)
            r1.setText(r3)
            goto L_0x0158
        L_0x014d:
            android.widget.TextView r1 = r0.Y0
            int r3 = defpackage.jpc.m3
            java.lang.String r3 = r0.getString(r3)
            r1.setText(r3)
        L_0x0158:
            android.widget.TextView r1 = r0.Z0
            r1.setVisibility(r8)
            goto L_0x01ac
        L_0x015e:
            y8a r1 = (defpackage.y8a) r1
            p82 r3 = r1.e()
            long r5 = r20.l0()
            e52 r3 = r3.C(r5)
            if (r3 == 0) goto L_0x0173
            java.lang.String r3 = r4.c(r3)
            goto L_0x0179
        L_0x0173:
            int r3 = defpackage.dpc.E
            java.lang.String r3 = r0.getString(r3)
        L_0x0179:
            android.widget.TextView r5 = r0.Y0
            v4 r6 = r1.getAccessor()
            java.lang.Class<ida> r11 = defpackage.ida.class
            java.lang.Object r6 = r6.c(r11)
            ida r6 = (defpackage.ida) r6
            tx4 r6 = r6.j
            java.lang.CharSequence r3 = r6.e(r3)
            r5.setText(r3)
            android.widget.TextView r3 = r0.Z0
            r3.setVisibility(r7)
            android.widget.TextView r3 = r0.Z0
            v4 r1 = r1.getAccessor()
            java.lang.Object r1 = r1.c(r11)
            ida r1 = (defpackage.ida) r1
            cu8 r5 = r4.a
            long r5 = r5.o
            java.lang.String r1 = r1.d(r5)
            r3.setText(r1)
        L_0x01ac:
            cu8 r1 = r4.a
            boolean r1 = r1.s()
            cu8 r3 = r4.a
            if (r1 == 0) goto L_0x020f
            android.widget.FrameLayout r1 = r0.n1
            int r1 = r1.getVisibility()
            if (r1 != r8) goto L_0x01c4
            android.widget.FrameLayout r1 = r0.n1
            r5 = 4
            r1.setVisibility(r5)
        L_0x01c4:
            long r5 = r3.N0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            int r11 = r3.M0
            long r11 = (long) r11
            long r11 = r1.toMillis(r11)
            long r16 = r11 + r5
            long r5 = r3.N0
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x01da
            r18 = r9
            goto L_0x01e8
        L_0x01da:
            vl r1 = defpackage.vl.o
            p7b r1 = r1.a()
            t33 r1 = r1.a
            long r5 = r1.n()
            r18 = r5
        L_0x01e8:
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.p1
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r11 = r16 - r18
            long r11 = r11 + r5
            r1.setBase(r11)
            long r14 = r3.N0
            int r1 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0207
            ru.ok.messages.secret.widgets.TimerView r13 = r0.o1
            r13.a(r14, r16, r18)
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.p1
            r1.w0 = r2
            r1.j()
            goto L_0x022a
        L_0x0207:
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.p1
            r1.w0 = r7
            r1.j()
            goto L_0x022a
        L_0x020f:
            android.widget.FrameLayout r1 = r0.n1
            r1.setVisibility(r8)
            ru.ok.messages.secret.widgets.TimerView r1 = r0.o1
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.b(r2)
            r5 = -1
            r1.u0 = r5
            r1.v0 = r5
            r1.w0 = r5
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.p1
            r1.w0 = r7
            r1.j()
        L_0x022a:
            android.content.Intent r1 = r20.getIntent()
            java.lang.String r2 = "ru.ok.tamtam.extra.COMPAT_MODE"
            boolean r1 = r1.getBooleanExtra(r2, r7)
            android.widget.ImageButton r2 = r0.a1
            if (r1 != 0) goto L_0x0258
            y7g r1 = r0.K0
            java.lang.Object r1 = r1.b
            ed3 r1 = (defpackage.ed3) r1
            y8a r1 = (defpackage.y8a) r1
            p82 r1 = r1.e()
            long r5 = r20.l0()
            e52 r0 = r1.C(r5)
            sw8 r1 = r4.Y
            r1.getClass()
            boolean r0 = defpackage.sw8.c(r0, r3)
            if (r0 == 0) goto L_0x0258
            goto L_0x0259
        L_0x0258:
            r7 = r8
        L_0x0259:
            r2.setVisibility(r7)
        L_0x025c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.ActAttachesView.q0(int):void");
    }

    public final void r0() {
        int indexOf;
        s20 s20 = this.W0;
        if (s20 != null && (indexOf = s20.j.indexOf(this.g1)) != -1) {
            q0(indexOf);
        }
    }

    public final void s0() {
        lj9 lj9;
        s20 s20 = this.W0;
        if (s20 != null) {
            FrgAttachView k = s20.k(this.g1);
            if ((k instanceof FrgAttachVideo) && (lj9 = ((FrgAttachVideo) k).N1) != null) {
                View u12 = lj9.u1();
                u12.post(new mg(u12, 5));
            }
        }
    }

    public final void t0(boolean z, boolean z2) {
        if (this.b1) {
            this.u1.i((Toolbar) this.q1.b);
            this.u1.i(this.X0);
            this.u1.i(this.t1);
        } else {
            this.u1.g((Toolbar) this.q1.b);
            this.u1.g(this.X0);
            this.u1.g(this.t1);
        }
        boolean z3 = this.b1;
        if (this.n1.getVisibility() != 8) {
            if (z3) {
                if (z) {
                    this.n1.animate().alpha(1.0f).setListener(new j5(this, 0));
                } else {
                    this.n1.animate().cancel();
                    this.n1.setVisibility(0);
                    this.n1.setAlpha(1.0f);
                }
            } else if (z) {
                this.n1.animate().alpha(0.0f).setListener(new j5(this, 1));
            } else {
                this.n1.animate().cancel();
                this.n1.setVisibility(4);
                this.n1.setAlpha(0.0f);
            }
        }
        s20 s20 = this.W0;
        if (s20 != null) {
            for (WeakReference weakReference : s20.o.values()) {
                FrgAttachView frgAttachView = (FrgAttachView) weakReference.get();
                if (frgAttachView != null) {
                    frgAttachView.C1();
                }
            }
        }
    }

    public final sme u() {
        if (this.y1 == null) {
            this.y1 = cl8.e0;
        }
        return this.y1;
    }

    @uae
    public void onEvent(fn4 fn4) {
        mpa l;
        s20 s20 = this.W0;
        if (s20 != null && this.P0 && (l = s20.l(this.f1.getCurrentItem())) != null) {
            l20 l20 = (l20) l.a;
            if (l20.d != null) {
                if (l20.r.equals(fn4.o)) {
                    this.Y0.setText(getString(jpc.k3));
                    this.Z0.setVisibility(8);
                    this.e1 = true;
                }
            }
        }
    }
}
