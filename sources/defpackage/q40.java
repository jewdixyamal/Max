package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: q40  reason: default package */
public final class q40 implements dce {
    public final Object X;
    public Object Y;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object o;

    public q40(b0d b0d, bdb bdb, m7b m7b, u7b u7b, je7 je7, bce bce) {
        this.a = b0d;
        this.b = bdb;
        this.c = m7b;
        this.o = u7b;
        this.X = je7;
        this.Y = bce;
    }

    public static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i) {
        int c2 = gse.c(context, vsb.colorControlHighlight);
        int b2 = gse.b(context, vsb.colorButtonNormal);
        int[] iArr = gse.b;
        int[] iArr2 = gse.d;
        int g = s63.g(c2, i);
        return new ColorStateList(new int[][]{iArr, iArr2, gse.c, gse.f}, new int[]{b2, g, s63.g(c2, i), i});
    }

    public static LayerDrawable f(oic oic, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable f = oic.f(context, bvb.abc_star_black_48dp);
        Drawable f2 = oic.f(context, bvb.abc_star_half_black_48dp);
        if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) f;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static void n(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(gn.c(i, gn.b));
    }

    public static vxd o(q40 q40, a66 a66) {
        String str = "job" + "-" + ((AtomicInteger) q40.Y).getAndIncrement();
        vxd T = j47.T((sx3) q40.a, (lx3) null, vx3.b, a66, 1);
        o87 o87 = new o87(str, T);
        ((ConcurrentHashMap) q40.X).put(str, T);
        ((kld) q40.o).g(o87);
        ((a66) q40.b).invoke((String) q40.c, "Adding for queue job=".concat(str));
        return T;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.p87
            if (r0 == 0) goto L_0x0013
            r0 = r6
            p87 r0 = (defpackage.p87) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            p87 r0 = new p87
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.util.Iterator r5 = r0.X
            java.util.concurrent.ConcurrentHashMap r2 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0077
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            defpackage.od2.a0(r6)
            java.lang.Object r6 = r5.X
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            int r2 = r6.size()
            java.lang.String r4 = "Cancelling all jobs in queue="
            java.lang.String r2 = defpackage.zr6.h(r2, r4)
            java.lang.Object r4 = r5.b
            a66 r4 = (defpackage.a66) r4
            java.lang.Object r5 = r5.c
            java.lang.String r5 = (java.lang.String) r5
            r4.invoke(r5, r2)
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0057:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            x77 r2 = (defpackage.x77) r2
            r4 = 0
            r2.cancel(r4)
            goto L_0x0057
        L_0x006e:
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r2 = r6
        L_0x0077:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0096
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            x77 r6 = (defpackage.x77) r6
            r0.o = r2
            r0.X = r5
            r0.s0 = r3
            java.lang.Object r6 = r6.join(r0)
            if (r6 != r1) goto L_0x0077
            return r1
        L_0x0096:
            r2.clear()
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q40.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public List c() {
        return l6d.i0(l6d.Z(new r1f(l6d.Z(new at(2, ((bce) this.Y).a()), new zbe(this, 0)), new zbe(this, 1)), new w8c(13)));
    }

    public ArrayList e() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList((LinkedHashSet) this.c);
        }
        return arrayList;
    }

    public List g(String str) {
        return l6d.i0(new r1f(l6d.e0(new r1f(l6d.Z(l6d.Z(new at(2, ((bce) this.Y).a()), new zbe(this, 3)), new ace(this, str, 0)), new ace(this, str, 1)), new w8c(14)), new ace(this, str, 2)));
    }

    public ArrayList h() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(e());
            synchronized (this.b) {
                arrayList2 = new ArrayList((LinkedHashSet) this.X);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public ColorStateList i(Context context, int i) {
        if (i == bvb.abc_edit_text_material) {
            return z7.n(context, itb.abc_tint_edittext);
        }
        if (i == bvb.abc_switch_track_mtrl_alpha) {
            return z7.n(context, itb.abc_tint_switch_track);
        }
        if (i == bvb.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d = gse.d(context, vsb.colorSwitchThumbNormal);
            if (d == null || !d.isStateful()) {
                iArr[0] = gse.b;
                iArr2[0] = gse.b(context, vsb.colorSwitchThumbNormal);
                iArr[1] = gse.e;
                iArr2[1] = gse.c(context, vsb.colorControlActivated);
                iArr[2] = gse.f;
                iArr2[2] = gse.c(context, vsb.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = gse.b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = gse.e;
                iArr2[1] = gse.c(context, vsb.colorControlActivated);
                iArr[2] = gse.f;
                iArr2[2] = d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == bvb.abc_btn_default_mtrl_shape) {
            return d(context, gse.c(context, vsb.colorButtonNormal));
        } else {
            if (i == bvb.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i == bvb.abc_btn_colored_material) {
                return d(context, gse.c(context, vsb.colorAccent));
            }
            if (i == bvb.abc_spinner_mtrl_am_alpha || i == bvb.abc_spinner_textfield_background_material) {
                return z7.n(context, itb.abc_tint_spinner);
            }
            if (a(i, (int[]) this.b)) {
                return gse.d(context, vsb.colorControlNormal);
            }
            if (a(i, (int[]) this.X)) {
                return z7.n(context, itb.abc_tint_default);
            }
            if (a(i, (int[]) this.Y)) {
                return z7.n(context, itb.abc_tint_btn_checkable);
            }
            if (i == bvb.abc_seekbar_thumb_material) {
                return z7.n(context, itb.abc_tint_seek_thumb);
            }
            return null;
        }
    }

    public void j(int i) {
        String str = (String) this.c;
        hm9.m(str, "On audio focus change, %d", Integer.valueOf(i));
        p40 p40 = (p40) this.b;
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    hm9.m(str, "onAudioFocusChange: AUDIOFOCUS_LOSS", new Object[0]);
                    if (p40.b() && p40.e() > 0.0f) {
                        hm9.m(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS. Stop", new Object[0]);
                        p40.pause();
                    }
                } else if (i == 1) {
                    if (!p40.b()) {
                        hm9.m(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Resuming player", new Object[0]);
                        p40.play();
                    }
                    float e = p40.e();
                    if (e > 0.0f && e < 1.0f) {
                        hm9.m(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Volume up", new Object[0]);
                        p40.g(1.0f);
                    }
                }
            } else if (p40.b() && p40.e() > 0.0f) {
                hm9.m(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player", new Object[0]);
                p40.pause();
            }
        } else if (p40.b() && p40.e() > 0.0f) {
            hm9.m(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2", new Object[0]);
            p40.g(0.2f);
        }
    }

    public void k() {
        AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.Y;
        if (audioFocusRequest != null) {
            this.Y = null;
            hm9.m((String) this.c, "Release audio focus", new Object[0]);
            fic fic = (fic) this.o;
            if (fic.a()) {
                ((Context) this.a).unregisterReceiver((BroadcastReceiver) fic.getValue());
                fic.reset();
            }
            ((AudioManager) ((khe) this.X).getValue()).abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public List l(LinkedHashSet linkedHashSet) {
        return l6d.i0(new r1f(l6d.Z(new at(2, ((bce) this.Y).a()), new k5d((Object) linkedHashSet, 4, (Object) this)), new zbe(this, 2)));
    }

    public void m(int i) {
        p40 p40 = (p40) this.b;
        if (p40.e() > 0.0f && p40.b()) {
            fic fic = (fic) this.o;
            boolean a2 = fic.a();
            Context context = (Context) this.a;
            if (a2) {
                context.unregisterReceiver((BroadcastReceiver) fic.getValue());
                fic.reset();
            }
            context.registerReceiver((BroadcastReceiver) fic.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            AudioFocusRequest build = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(p40).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(i).build()).build();
            this.Y = build;
            hm9.m((String) this.c, "Request audio focus", new Object[0]);
            ((AudioManager) ((khe) this.X).getValue()).requestAudioFocus(build);
        }
    }

    public ybe p(uj3 uj3, String str) {
        String j = uj3.j();
        ArrayList arrayList = new ArrayList();
        jl3 h = uj3.h();
        String a2 = h != null ? h.a() : null;
        if (a2 != null) {
            arrayList.add(a2);
        }
        return ((bdb) this.b).b(uj3.n(), arrayList, j, str, uj3.q(((p7b) ((m7b) this.c)).a.q(), kk0.c), ((u7b) this.o).b(uj3.n()), ((y4d) ((je7) this.X).getValue()).a(uj3.n()));
    }

    public q40(Context context, p40 p40) {
        this.a = context;
        this.b = p40;
        this.c = q40.class.getName();
        this.o = new fic(new o40(this, 0));
        this.X = new khe(new o40(this, 1));
    }

    public q40(ContextScope contextScope, String str, ai0 ai0) {
        this.a = contextScope;
        this.c = str;
        this.b = ai0;
        this.o = lld.a(1, Integer.MAX_VALUE, 2);
        this.X = new ConcurrentHashMap();
        this.Y = new AtomicInteger(0);
        ai0.invoke(str, "init " + this);
    }

    public q40(q6d q6d) {
        this.b = new Object();
        this.c = new LinkedHashSet();
        this.o = new LinkedHashSet();
        this.X = new LinkedHashSet();
        this.Y = new nw1(this);
        this.a = q6d;
    }

    public q40() {
        this.a = new int[]{bvb.abc_textfield_search_default_mtrl_alpha, bvb.abc_textfield_default_mtrl_alpha, bvb.abc_ab_share_pack_mtrl_alpha};
        this.b = new int[]{bvb.abc_ic_commit_search_api_mtrl_alpha, bvb.abc_seekbar_tick_mark_material, bvb.abc_ic_menu_share_mtrl_alpha, bvb.abc_ic_menu_copy_mtrl_am_alpha, bvb.abc_ic_menu_cut_mtrl_alpha, bvb.abc_ic_menu_selectall_mtrl_alpha, bvb.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{bvb.abc_textfield_activated_mtrl_alpha, bvb.abc_textfield_search_activated_mtrl_alpha, bvb.abc_cab_background_top_mtrl_alpha, bvb.abc_text_cursor_material, bvb.abc_text_select_handle_left_mtrl, bvb.abc_text_select_handle_middle_mtrl, bvb.abc_text_select_handle_right_mtrl};
        this.o = new int[]{bvb.abc_popup_background_mtrl_mult, bvb.abc_cab_background_internal_bg, bvb.abc_menu_hardkey_panel_mtrl_mult};
        this.X = new int[]{bvb.abc_tab_indicator_material, bvb.abc_textfield_search_material};
        this.Y = new int[]{bvb.abc_btn_check_material, bvb.abc_btn_radio_material, bvb.abc_btn_check_material_anim, bvb.abc_btn_radio_material_anim};
    }
}
