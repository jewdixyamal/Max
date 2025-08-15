package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import java.lang.Thread;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.tamtam.nano.Protos;

/* renamed from: lr1  reason: default package */
public final /* synthetic */ class lr1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ lr1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARNING: type inference failed for: r15v22, types: [one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    public final Object invoke(Object obj) {
        SpannableString spannableString;
        boolean z = false;
        switch (this.a) {
            case 0:
                Conversation conversation = (Conversation) obj;
                k56 k56 = ((lyd) this.o).d;
                if (k56 != null) {
                    k56.invoke();
                }
                z31 z31 = (z31) ((mec) this.b).a;
                if (z31 != null) {
                    ((wr1) this.c).g(z31);
                }
                return e5f.a;
            case 1:
                hm9.m("CallEngineTag", ((sx3) this.o) + " conversation for answer is created " + ((Conversation) obj).getConversationId(), new Object[0]);
                z31 z312 = (z31) ((mec) this.b).a;
                if (z312 != null) {
                    bc7[] bc7Arr = wr1.K;
                    ((wr1) this.c).g(z312);
                }
                return e5f.a;
            case 2:
                ((l53) this.o).U0.invoke(new e19((f53) this.b, ((MessageModel) this.c).a, (String) obj));
                return e5f.a;
            case 3:
                ((l53) this.o).U0.invoke(new e19((f53) this.b, ((MessageModel) this.c).a, (String) obj));
                return e5f.a;
            case 4:
                w6b h = ((ida) this.o).h((String) obj);
                return new w6b(ema.v(qp4.u0.b((Context) this.c).i(), h, ema.s(h.a.toString(), ((vpb) this.b).b)), h.b);
            case 5:
                pl8 pl8 = (pl8) this.o;
                ml8 ml8 = (ml8) this.b;
                dd3 dd3 = (dd3) this.c;
                bi4 bi4 = (bi4) obj;
                String str = (String) pl8.b;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, str, "executeWithDetachableLooper", (Throwable) null);
                }
                String str2 = ((el8) pl8.c).c;
                h1f u = pl8.u(pl8.r(ml8), new ol8(ml8, pl8, bi4, 0));
                khe khe = bi4.c;
                Handler handler = new Handler(bi4.b, (Handler.Callback) null);
                ((el8) pl8.c).getClass();
                ((el8) pl8.c).getClass();
                hl8 hl8 = new hl8(handler, u, 500, 300000, (wz7) ((el8) pl8.c).l);
                try {
                    u.e(dd3, str2);
                    hl8.b();
                    String str3 = (String) pl8.b;
                    ir6 ir62 = hm9.m;
                    if (ir62 != null) {
                        if (ir62.c()) {
                            ir62.d(us7.X, str3, "executeWithDetachableLooper, starting loop ...", (Throwable) null);
                        }
                    }
                    if (tpa.f(bi4.b.getThread(), Thread.currentThread())) {
                        Looper.loop();
                        String str4 = (String) pl8.b;
                        ir6 ir63 = hm9.m;
                        if (ir63 != null) {
                            if (ir63.c()) {
                                ir63.d(us7.X, str4, "executeWithDetachableLooper, loop completed", (Throwable) null);
                            }
                        }
                        pl8.o(u);
                        hl8.a();
                        return e5f.a;
                    }
                    throw new IllegalStateException("Illegal thread".toString());
                } catch (Throwable th) {
                    pl8.o(u);
                    hl8.a();
                    throw th;
                }
            case 6:
                uj3 uj3 = (uj3) obj;
                if (!uj3.w() && !((List) this.o).contains(uj3) && uj3.n() != ((hyc) ((jq8) ((mec) this.b).a).Y).t() && uj3.n() == ((cu8) this.c).Y) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                yy7 yy7 = (yy7) obj;
                yy7.a = (e52) this.o;
                yy7.c = (cu8) this.b;
                yy7.e = (u6b) this.c;
                return e5f.a;
            case 8:
                String str5 = (String) obj;
                TextView textView = (TextView) this.o;
                String str6 = (String) this.b;
                if (textView != null) {
                    jyc jyc = jyc.a;
                    List<String> e = jyc.r().e(str5, str6);
                    String e2 = bre.e(str5);
                    if (!(e2 == null || e2.length() == 0 || textView.getPaint().measureText(e2) <= ((float) textView.getMeasuredWidth()))) {
                        String[] l = jyc.r().l(e2);
                        if (!oag.t(e2) && !nd7.D(e) && l != null && l.length != 0) {
                            int i = 0;
                            while (true) {
                                if (i < l.length) {
                                    for (String str7 : e) {
                                        if (!oag.t(str7) && l[i].regionMatches(true, 0, str7, 0, str7.length())) {
                                            int indexOf = e2.indexOf(l[i]);
                                            if (i != 0 && indexOf > 10) {
                                                e2 = "…" + e2.substring(Math.max(0, indexOf - 10));
                                            }
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                    spannableString = ema.u(e2, jyc.a.r().d(e2.toString(), e), qp4.u0.j(textView));
                } else {
                    String e3 = bre.e(str5);
                    jyc jyc2 = jyc.a;
                    spannableString = ema.u(e3, jyc2.r().d(e3.toString(), jyc2.r().e(e3, str6)), (fka) this.c);
                }
                return jyc.a.o().j.e(spannableString);
            case 9:
                String str8 = (String) obj;
                Integer num = (Integer) this.c;
                int intValue = num != null ? num.intValue() : 5;
                bkb bkb = (bkb) this.b;
                return new ika((String) this.o, (Thread.UncaughtExceptionHandler) bkb.a, intValue, (vse) ((k56) bkb.b).invoke());
            case 10:
                Long l2 = (Long) obj;
                return ((v6b) ((t6b) this.o).b.getValue()).a((e52) this.c, (cu8) this.b);
            case 11:
                alc alc = (alc) this.o;
                alc.getClass();
                return alc.f(alc, (List) this.b, (Set) this.c, (Continuation) obj);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                View view = (View) this.o;
                float translationY = ((float) 1) - (view.getTranslationY() / (fk4.d().getDisplayMetrics().density * 4.0f));
                float translationY2 = view.getTranslationY() == 0.0f ? fk4.d().getDisplayMetrics().density * 4.0f : view.getTranslationY();
                float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{translationY2, 0.0f});
                ofFloat.setDuration((long) (((float) 200) * translationY));
                ofFloat.setInterpolator(rwc.x0);
                ofFloat.addListener(new f60((rwc) this.b, (lwc) this.c, view, 1));
                ofFloat.addUpdateListener(new pmc(view, animatedFraction, 1));
                ofFloat.start();
                return ofFloat;
            default:
                ((c66) this.o).invoke((View) obj, (w9f) this.b, Integer.valueOf(((y9f) this.c).h()));
                return e5f.a;
        }
    }

    public /* synthetic */ lr1(String str, fka fka) {
        this.a = 8;
        this.o = null;
        this.b = str;
        this.c = fka;
    }
}
