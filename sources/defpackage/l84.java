package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.camera.core.ImageCaptureException;
import androidx.recyclerview.widget.a;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;

/* renamed from: l84  reason: default package */
public final class l84 implements lg {
    public static final /* synthetic */ int f = 0;
    public Object a;
    public Object b = HttpGet.METHOD_NAME;
    public Object c = new bj6();
    public Object d;
    public Object e = new LinkedHashMap();

    public int A() {
        int m;
        kq0.e();
        c54.p("The ImageReader is not initialized.", ((hqc) this.b) != null);
        hqc hqc = (hqc) this.b;
        synchronized (hqc.a) {
            m = hqc.o.m() - hqc.b;
        }
        return m;
    }

    public int B(int i, ym5 ym5, int i2) {
        xm5 xm5 = (xm5) this.a;
        a aVar = (a) xm5;
        bn5 bn5 = (bn5) ym5;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) xm5;
        int x = a.x(flexboxLayoutManager.f(), flexboxLayoutManager.o, flexboxLayoutManager.m, aVar.I() + aVar.L() + bn5.topMargin + bn5.bottomMargin + i2, bn5.height);
        int size = View.MeasureSpec.getSize(x);
        int i3 = bn5.w0;
        if (size > i3) {
            return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(x));
        }
        int i4 = bn5.u0;
        return size < i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(x)) : x;
    }

    public int C(int i, ym5 ym5, int i2) {
        xm5 xm5 = (xm5) this.a;
        a aVar = (a) xm5;
        bn5 bn5 = (bn5) ym5;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) xm5;
        int x = a.x(flexboxLayoutManager.e(), flexboxLayoutManager.n, flexboxLayoutManager.l, aVar.K() + aVar.J() + bn5.leftMargin + bn5.rightMargin + i2, bn5.width);
        int size = View.MeasureSpec.getSize(x);
        int i3 = bn5.v0;
        if (size > i3) {
            return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(x));
        }
        int i4 = bn5.t0;
        return size < i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(x)) : x;
    }

    public void D(String str, String str2) {
        ((bj6) this.c).h(str, str2);
    }

    public void E(View view, zm5 zm5, int i, int i2, int i3, int i4) {
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((xm5) this.a);
        int i5 = flexboxLayoutManager.r;
        bn5 bn5 = (bn5) ((ym5) view.getLayoutParams());
        int i6 = bn5.Z;
        if (i6 != -1) {
            i5 = i6;
        }
        int i7 = zm5.c;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    int measuredHeight = (((i7 - view.getMeasuredHeight()) + bn5.topMargin) - bn5.bottomMargin) / 2;
                    if (flexboxLayoutManager.q != 2) {
                        int i8 = i2 + measuredHeight;
                        view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                        return;
                    }
                    int i9 = i2 - measuredHeight;
                    view.layout(i, i9, i3, view.getMeasuredHeight() + i9);
                    return;
                } else if (i5 != 3) {
                    if (i5 != 4) {
                        return;
                    }
                } else if (flexboxLayoutManager.q != 2) {
                    int max = Math.max(zm5.h - view.getBaseline(), bn5.topMargin);
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (zm5.h - view.getMeasuredHeight()), bn5.bottomMargin);
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (flexboxLayoutManager.q != 2) {
                int i10 = i2 + i7;
                int i11 = bn5.bottomMargin;
                view.layout(i, (i10 - view.getMeasuredHeight()) - i11, i3, i10 - i11);
                return;
            } else {
                view.layout(i, view.getMeasuredHeight() + (i2 - i7) + bn5.topMargin, i3, view.getMeasuredHeight() + (i4 - i7) + bn5.topMargin);
                return;
            }
        }
        if (flexboxLayoutManager.q != 2) {
            int i12 = bn5.topMargin;
            view.layout(i, i2 + i12, i3, i4 + i12);
            return;
        }
        int i13 = bn5.bottomMargin;
        view.layout(i, i2 - i13, i3, i4 - i13);
    }

    public void F(View view, zm5 zm5, boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((FlexboxLayoutManager) ((xm5) this.a)).r;
        bn5 bn5 = (bn5) ((ym5) view.getLayoutParams());
        int i6 = bn5.Z;
        if (i6 != -1) {
            i5 = i6;
        }
        int i7 = zm5.c;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((marginLayoutParams.getMarginStart() + (i7 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                    if (!z) {
                        view.layout(i + marginStart, i2, i3 + marginStart, i4);
                        return;
                    } else {
                        view.layout(i - marginStart, i2, i3 - marginStart, i4);
                        return;
                    }
                } else if (!(i5 == 3 || i5 == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i7) - view.getMeasuredWidth()) - bn5.rightMargin, i2, ((i3 + i7) - view.getMeasuredWidth()) - bn5.rightMargin, i4);
                return;
            } else {
                view.layout(view.getMeasuredWidth() + (i - i7) + bn5.leftMargin, i2, view.getMeasuredWidth() + (i3 - i7) + bn5.leftMargin, i4);
                return;
            }
        }
        if (!z) {
            int i8 = bn5.leftMargin;
            view.layout(i + i8, i2, i3 + i8, i4);
            return;
        }
        int i9 = bn5.rightMargin;
        view.layout(i - i9, i2, i3 - i9, i4);
    }

    public void G(String str, tfg tfg) {
        if (str.length() > 0) {
            if (tfg == null) {
                if (!(!(str.equals(HttpPost.METHOD_NAME) || str.equals(HttpPut.METHOD_NAME) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")))) {
                    throw new IllegalArgumentException(zr6.i("method ", str, " must have a request body.").toString());
                }
            } else if (!tu0.z(str)) {
                throw new IllegalArgumentException(zr6.i("method ", str, " must not have a request body.").toString());
            }
            this.b = str;
            this.d = tfg;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public void H(ov6 ov6) {
        kq0.e();
        if (((x9b) this.a) == null) {
            Objects.toString(ov6);
            ov6.close();
            return;
        }
        nje c2 = ov6.getImageInfo().c();
        if (((Integer) c2.a.get(((x9b) this.a).g)) == null) {
            ov6.close();
            return;
        }
        kq0.e();
        ib0 ib0 = (ib0) this.c;
        Objects.requireNonNull(ib0);
        ib0.a.accept(new jb0((x9b) this.a, ov6));
        x9b x9b = (x9b) this.a;
        this.a = null;
        int i = x9b.j;
        yhc yhc = x9b.f;
        if (!(i == -1 || i == 100)) {
            x9b.j = 100;
            yhc.getClass();
            kq0.e();
            if (!yhc.g) {
                fc0 fc0 = yhc.a;
                fc0.getClass();
                fc0.b.execute(new wje(fc0));
            }
        }
        yhc.getClass();
        kq0.e();
        if (!yhc.g) {
            if (!yhc.h) {
                kq0.e();
                if (!yhc.g && !yhc.h) {
                    yhc.h = true;
                    ey1 ey1 = yhc.a.c;
                }
            }
            yhc.e.b((Object) null);
        }
    }

    public void I(x9b x9b) {
        kq0.e();
        boolean z = false;
        c54.p("only one capture stage is supported.", x9b.h.size() == 1);
        if (A() > 0) {
            z = true;
        }
        c54.p("Too many acquire images. Close image to be able to process next.", z);
        this.a = x9b;
        kq0.a(x9b.i, new ph4((Object) this, (Object) x9b, false), ju0.k());
    }

    public void J(String str) {
        ((bj6) this.c).g(str);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, ai3] */
    public void K(ia0 ia0) {
        Object obj = new Object();
        hc0 hc0 = (hc0) this.a;
        if (hc0 != null) {
            String str = (String) this.b;
            if (str == null) {
                throw new NullPointerException("Null transportName");
            } else if (((av1) this.d) != null) {
                i15 i15 = (i15) this.c;
                if (i15 != null) {
                    o2f o2f = (o2f) this.e;
                    o2f.getClass();
                    z8b z8b = z8b.a;
                    vq7 a2 = hc0.a();
                    a2.t(hc0.a);
                    a2.o = z8b;
                    a2.c = hc0.b;
                    hc0 j = a2.j();
                    ? obj2 = new Object();
                    obj2.Y = new HashMap();
                    obj2.o = Long.valueOf(o2f.a.a());
                    obj2.X = Long.valueOf(o2f.b.a());
                    obj2.a = str;
                    a99 a99 = (a99) ia0.a;
                    a99.getClass();
                    pl8 pl8 = kob.a;
                    pl8.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        pl8.v(a99, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    obj2.c = new i05(i15, byteArrayOutputStream.toByteArray());
                    obj2.b = null;
                    ja0 c2 = obj2.c();
                    kd4 kd4 = (kd4) o2f.c;
                    kd4.getClass();
                    kd4.b.execute(new yg3((Object) kd4, (Object) j, obj, (Object) c2, 1));
                    return;
                }
                throw new NullPointerException("Null encoding");
            } else {
                throw new NullPointerException("Null transformer");
            }
        } else {
            throw new NullPointerException("Null transportContext");
        }
    }

    public void L(ec0 ec0) {
        boolean z;
        kq0.e();
        x9b x9b = (x9b) this.a;
        if (x9b != null && x9b.a == ec0.a) {
            yhc yhc = x9b.f;
            yhc.getClass();
            kq0.e();
            if (!yhc.g) {
                fc0 fc0 = yhc.a;
                fc0.getClass();
                kq0.e();
                int i = fc0.a;
                if (i > 0) {
                    z = true;
                    fc0.a = i - 1;
                } else {
                    z = false;
                }
                ImageCaptureException imageCaptureException = ec0.b;
                if (!z) {
                    kq0.e();
                    fc0.getClass();
                    fc0.b.execute(new flc(fc0, 26, imageCaptureException));
                }
                yhc.a();
                yhc.e.d(imageCaptureException);
                if (z) {
                    vje vje = yhc.b;
                    vje.getClass();
                    kq0.e();
                    vje.a.addFirst(fc0);
                    vje.c();
                }
            }
        }
    }

    public void M(int i, int i2, zm5 zm5, int i3, int i4, boolean z) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        zm5 zm52 = zm5;
        int i9 = i3;
        int i10 = zm52.a;
        float f2 = zm52.g;
        boolean z3 = false;
        if (f2 > 0.0f && i9 <= i10) {
            float f3 = ((float) (i10 - i9)) / f2;
            zm52.a = i4 + zm52.b;
            if (!z) {
                zm52.c = Integer.MIN_VALUE;
            }
            int i11 = 0;
            boolean z4 = false;
            int i12 = 0;
            float f4 = 0.0f;
            while (i11 < zm52.d) {
                int i13 = zm52.k + i11;
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((xm5) this.a);
                View Z0 = flexboxLayoutManager.Z0(i13);
                if (Z0 == null || Z0.getVisibility() == 8) {
                    int i14 = i2;
                    i6 = i11;
                    z2 = z3;
                    i5 = i10;
                } else {
                    ym5 ym5 = (ym5) Z0.getLayoutParams();
                    int i15 = flexboxLayoutManager.p;
                    if (i15 == 0 || i15 == 1) {
                        i5 = i10;
                        int i16 = i11;
                        int i17 = i;
                        int measuredWidth = Z0.getMeasuredWidth();
                        long[] jArr = (long[]) this.e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i13];
                        }
                        int measuredHeight = Z0.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.e;
                        if (jArr2 != null) {
                            long j = jArr2[i13];
                            i6 = i16;
                            measuredHeight = (int) (j >> 32);
                        } else {
                            i6 = i16;
                        }
                        if (!((boolean[]) this.b)[i13]) {
                            bn5 bn5 = (bn5) ym5;
                            float f5 = bn5.Y;
                            z2 = false;
                            if (f5 > 0.0f) {
                                float f6 = ((float) measuredWidth) - (f3 * f5);
                                if (i6 == zm52.d - 1) {
                                    f6 += f4;
                                    f4 = 0.0f;
                                }
                                int round = Math.round(f6);
                                int i18 = bn5.t0;
                                if (round < i18) {
                                    ((boolean[]) this.b)[i13] = true;
                                    zm52.g -= f5;
                                    z4 = true;
                                    round = i18;
                                } else {
                                    float f7 = (f6 - ((float) round)) + f4;
                                    double d2 = (double) f7;
                                    if (d2 > 1.0d) {
                                        round++;
                                        f7 -= 1.0f;
                                    } else if (d2 < -1.0d) {
                                        round--;
                                        f7 += 1.0f;
                                    }
                                    f4 = f7;
                                }
                                int B = B(i2, ym5, zm52.i);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                Z0.measure(makeMeasureSpec, B);
                                int measuredWidth2 = Z0.getMeasuredWidth();
                                int measuredHeight2 = Z0.getMeasuredHeight();
                                R(Z0, i13, makeMeasureSpec, B);
                                flexboxLayoutManager.k1(Z0, i13);
                                measuredWidth = measuredWidth2;
                                measuredHeight = measuredHeight2;
                            } else {
                                int i19 = i2;
                            }
                        } else {
                            int i20 = i2;
                            z2 = false;
                        }
                        bn5 bn52 = (bn5) ym5;
                        int max = Math.max(i12, flexboxLayoutManager.Y0(Z0) + measuredHeight + bn52.topMargin + bn52.bottomMargin);
                        zm52.a = measuredWidth + bn52.leftMargin + bn52.rightMargin + zm52.a;
                        i7 = max;
                    } else {
                        int measuredHeight3 = Z0.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.e;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i13] >> 32);
                        }
                        int measuredWidth3 = Z0.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i13];
                        }
                        if (!((boolean[]) this.b)[i13]) {
                            bn5 bn53 = (bn5) ym5;
                            float f8 = bn53.Y;
                            if (f8 > 0.0f) {
                                float f9 = ((float) measuredHeight3) - (f3 * f8);
                                if (i11 == zm52.d - 1) {
                                    f9 += f4;
                                    f4 = 0.0f;
                                }
                                int round2 = Math.round(f9);
                                int i21 = bn53.u0;
                                if (round2 < i21) {
                                    ((boolean[]) this.b)[i13] = true;
                                    zm52.g -= f8;
                                    i8 = i11;
                                    round2 = i21;
                                    z4 = true;
                                    i5 = i10;
                                } else {
                                    float f10 = (f9 - ((float) round2)) + f4;
                                    i5 = i10;
                                    i8 = i11;
                                    double d3 = (double) f10;
                                    if (d3 > 1.0d) {
                                        round2++;
                                        f10 -= 1.0f;
                                    } else if (d3 < -1.0d) {
                                        round2--;
                                        f10 += 1.0f;
                                    }
                                    f4 = f10;
                                }
                                int C = C(i, ym5, zm52.i);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                Z0.measure(C, makeMeasureSpec2);
                                int measuredWidth4 = Z0.getMeasuredWidth();
                                int measuredHeight4 = Z0.getMeasuredHeight();
                                R(Z0, i13, C, makeMeasureSpec2);
                                flexboxLayoutManager.k1(Z0, i13);
                                measuredWidth3 = measuredWidth4;
                                measuredHeight3 = measuredHeight4;
                                bn5 bn54 = (bn5) ym5;
                                i7 = Math.max(i12, flexboxLayoutManager.Y0(Z0) + measuredWidth3 + bn54.leftMargin + bn54.rightMargin);
                                zm52.a = measuredHeight3 + bn54.topMargin + bn54.bottomMargin + zm52.a;
                                int i22 = i2;
                                i6 = i8;
                                z2 = false;
                            }
                        }
                        i5 = i10;
                        i8 = i11;
                        int i23 = i;
                        bn5 bn542 = (bn5) ym5;
                        i7 = Math.max(i12, flexboxLayoutManager.Y0(Z0) + measuredWidth3 + bn542.leftMargin + bn542.rightMargin);
                        zm52.a = measuredHeight3 + bn542.topMargin + bn542.bottomMargin + zm52.a;
                        int i222 = i2;
                        i6 = i8;
                        z2 = false;
                    }
                    zm52.c = Math.max(zm52.c, i7);
                    i12 = i7;
                }
                i11 = i6 + 1;
                int i24 = i3;
                i10 = i5;
                z3 = z2;
            }
            int i25 = i2;
            int i26 = i10;
            if (z4 && i26 != zm52.a) {
                M(i, i2, zm5, i3, i4, true);
            }
        }
    }

    public void N(View view, int i, int i2) {
        ym5 ym5 = (ym5) view.getLayoutParams();
        bn5 bn5 = (bn5) ym5;
        int i3 = (i - ((bn5) ym5).leftMargin) - bn5.rightMargin;
        xm5 xm5 = (xm5) this.a;
        int min = Math.min(Math.max(i3 - ((FlexboxLayoutManager) xm5).Y0(view), bn5.t0), bn5.v0);
        long[] jArr = (long[]) this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        R(view, i2, makeMeasureSpec2, makeMeasureSpec);
        ((FlexboxLayoutManager) xm5).k1(view, i2);
    }

    public void O(View view, int i, int i2) {
        ym5 ym5 = (ym5) view.getLayoutParams();
        bn5 bn5 = (bn5) ym5;
        int i3 = (i - ((bn5) ym5).topMargin) - bn5.bottomMargin;
        xm5 xm5 = (xm5) this.a;
        int min = Math.min(Math.max(i3 - ((FlexboxLayoutManager) xm5).Y0(view), bn5.u0), bn5.w0);
        long[] jArr = (long[]) this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        R(view, i2, makeMeasureSpec, makeMeasureSpec2);
        ((FlexboxLayoutManager) xm5).k1(view, i2);
    }

    public void P(int i) {
        View Z0;
        int i2;
        int i3 = i;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((xm5) this.a);
        if (i3 < flexboxLayoutManager.y.b()) {
            int i4 = flexboxLayoutManager.p;
            if (flexboxLayoutManager.r == 4) {
                int[] iArr = (int[]) this.c;
                List list = flexboxLayoutManager.v;
                int size = list.size();
                for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size; i5++) {
                    zm5 zm5 = (zm5) list.get(i5);
                    int i6 = zm5.d;
                    for (int i7 = 0; i7 < i6; i7++) {
                        int i8 = zm5.k + i7;
                        if (i7 < flexboxLayoutManager.y.b() && (Z0 = flexboxLayoutManager.Z0(i8)) != null && Z0.getVisibility() != 8 && ((i2 = ((bn5) ((ym5) Z0.getLayoutParams())).Z) == -1 || i2 == 4)) {
                            if (i4 == 0 || i4 == 1) {
                                O(Z0, zm5.c, i8);
                            } else if (i4 == 2 || i4 == 3) {
                                N(Z0, zm5.c, i8);
                            } else {
                                throw new IllegalArgumentException(zr6.h(i4, "Invalid flex direction: "));
                            }
                        }
                    }
                }
                return;
            }
            for (zm5 zm52 : flexboxLayoutManager.v) {
                Iterator it = zm52.j.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View Z02 = flexboxLayoutManager.Z0(num.intValue());
                        if (i4 == 0 || i4 == 1) {
                            O(Z02, zm52.c, num.intValue());
                        } else if (i4 == 2 || i4 == 3) {
                            N(Z02, zm52.c, num.intValue());
                        } else {
                            throw new IllegalArgumentException(zr6.h(i4, "Invalid flex direction: "));
                        }
                    }
                }
            }
        }
    }

    public void Q(String str) {
        Class<Object> cls = Object.class;
        if (str == null) {
            ((LinkedHashMap) this.e).remove(cls);
            return;
        }
        if (((LinkedHashMap) this.e).isEmpty()) {
            this.e = new LinkedHashMap();
        }
        ((LinkedHashMap) this.e).put(cls, cls.cast(str));
    }

    public void R(View view, int i, int i2, int i3) {
        long[] jArr = (long[]) this.d;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = (long[]) this.e;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }

    public void S(String str) {
        if (eae.o0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (eae.o0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        od3 od3 = new od3();
        od3.j((vq6) null, str);
        this.a = od3.b();
    }

    public ph4 a(View view) {
        return new ph4((Object) view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(f()).setDuration(200).withStartAction(new mg(view, 1)));
    }

    public long b() {
        return 200;
    }

    public ph4 c(View view) {
        return new ph4((Object) view.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(l()).setDuration(200).withEndAction(new mg(view, 3)));
    }

    public Interpolator d() {
        if (((vb5) this.b) == null) {
            this.b = new vb5(1);
        }
        return (vb5) this.b;
    }

    public ph4 e(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setInterpolator(d());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new ng(2, view));
        view.startAnimation(translateAnimation);
        return new ph4(translateAnimation);
    }

    public Interpolator f() {
        if (((OvershootInterpolator) this.e) == null) {
            this.e = new OvershootInterpolator();
        }
        return (OvershootInterpolator) this.e;
    }

    public ph4 g(View view) {
        return new ph4((Object) view.animate().alpha(0.0f).setInterpolator(l()).setDuration(200).withEndAction(new mg(view, 2)));
    }

    public long h() {
        return 150;
    }

    public ph4 i(View view) {
        return new ph4((Object) view.animate().alpha(1.0f).setInterpolator(d()).setDuration(200).withStartAction(new mg(view, 0)));
    }

    public ph4 j(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setInterpolator(d());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new ng(0, view));
        view.startAnimation(translateAnimation);
        return new ph4(translateAnimation);
    }

    public Interpolator k() {
        if (((LinearInterpolator) this.a) == null) {
            this.a = new LinearInterpolator();
        }
        return (LinearInterpolator) this.a;
    }

    public Interpolator l() {
        if (((vb5) this.c) == null) {
            this.c = new vb5(0);
        }
        return (vb5) this.c;
    }

    public ph4 m(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setInterpolator(l());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new ng(1, view));
        view.startAnimation(translateAnimation);
        return new ph4(translateAnimation);
    }

    public Interpolator n() {
        if (((wb5) this.d) == null) {
            this.d = new wb5();
        }
        return (wb5) this.d;
    }

    public ph4 o(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setInterpolator(l());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new ng(3, view));
        view.startAnimation(translateAnimation);
        return new ph4(translateAnimation);
    }

    public void p(List list, zm5 zm5, int i, int i2) {
        zm5.i = i2;
        ((xm5) this.a).getClass();
        zm5.l = i;
        list.add(zm5);
    }

    public void q(String str, String str2) {
        ((bj6) this.c).a(str, str2);
    }

    public mhc r() {
        vq6 vq6 = (vq6) this.a;
        if (vq6 != null) {
            String str = (String) this.b;
            cj6 c2 = ((bj6) this.c).c();
            tfg tfg = (tfg) this.d;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
            byte[] bArr = naf.a;
            return new mhc(vq6, str, c2, tfg, linkedHashMap.isEmpty() ? oz4.a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
        }
        throw new IllegalStateException("url == null".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(defpackage.wd6 r26, int r27, int r28, int r29, int r30, int r31, java.util.List r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r31
            java.lang.Object r3 = r0.a
            xm5 r3 = (defpackage.xm5) r3
            r4 = r3
            com.google.android.flexbox.FlexboxLayoutManager r4 = (com.google.android.flexbox.FlexboxLayoutManager) r4
            boolean r5 = r4.d1()
            int r6 = android.view.View.MeasureSpec.getMode(r27)
            int r7 = android.view.View.MeasureSpec.getSize(r27)
            if (r32 != 0) goto L_0x0021
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = r26
            goto L_0x0025
        L_0x0021:
            r9 = r26
            r8 = r32
        L_0x0025:
            r9.b = r8
            r10 = -1
            if (r1 != r10) goto L_0x002c
            r11 = 1
            goto L_0x002d
        L_0x002c:
            r11 = 0
        L_0x002d:
            if (r5 == 0) goto L_0x003f
            r12 = r3
            androidx.recyclerview.widget.a r12 = (androidx.recyclerview.widget.a) r12
            androidx.recyclerview.widget.RecyclerView r12 = r12.b
            if (r12 == 0) goto L_0x003d
            java.util.WeakHashMap r13 = defpackage.zmf.a
            int r12 = r12.getPaddingStart()
            goto L_0x0046
        L_0x003d:
            r12 = 0
            goto L_0x0046
        L_0x003f:
            r12 = r3
            androidx.recyclerview.widget.a r12 = (androidx.recyclerview.widget.a) r12
            int r12 = r12.L()
        L_0x0046:
            if (r5 == 0) goto L_0x0058
            r13 = r3
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.b
            if (r13 == 0) goto L_0x0056
            java.util.WeakHashMap r14 = defpackage.zmf.a
            int r13 = r13.getPaddingEnd()
            goto L_0x005f
        L_0x0056:
            r13 = 0
            goto L_0x005f
        L_0x0058:
            r13 = r3
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            int r13 = r13.I()
        L_0x005f:
            if (r5 == 0) goto L_0x0069
            r14 = r3
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            int r14 = r14.L()
            goto L_0x0078
        L_0x0069:
            r14 = r3
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            androidx.recyclerview.widget.RecyclerView r14 = r14.b
            if (r14 == 0) goto L_0x0077
            java.util.WeakHashMap r15 = defpackage.zmf.a
            int r14 = r14.getPaddingStart()
            goto L_0x0078
        L_0x0077:
            r14 = 0
        L_0x0078:
            if (r5 == 0) goto L_0x0082
            r15 = r3
            androidx.recyclerview.widget.a r15 = (androidx.recyclerview.widget.a) r15
            int r15 = r15.I()
            goto L_0x0091
        L_0x0082:
            r15 = r3
            androidx.recyclerview.widget.a r15 = (androidx.recyclerview.widget.a) r15
            androidx.recyclerview.widget.RecyclerView r15 = r15.b
            if (r15 == 0) goto L_0x0090
            java.util.WeakHashMap r16 = defpackage.zmf.a
            int r15 = r15.getPaddingEnd()
            goto L_0x0091
        L_0x0090:
            r15 = 0
        L_0x0091:
            zm5 r9 = new zm5
            r9.<init>()
            r10 = r30
            r9.k = r10
            int r12 = r12 + r13
            r9.a = r12
            zdc r13 = r4.y
            int r13 = r13.b()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r16
            r17 = 0
            r18 = 0
        L_0x00ab:
            if (r10 >= r13) goto L_0x049f
            android.view.View r2 = r4.Z0(r10)
            if (r2 != 0) goto L_0x00d1
            r20 = 1
            int r2 = r13 + -1
            if (r10 != r2) goto L_0x00cc
            int r2 = r9.d
            r30 = r11
            int r11 = r9.e
            int r2 = r2 - r11
            r11 = r17
            if (r2 == 0) goto L_0x00c7
            r0.p(r8, r9, r10, r11)
        L_0x00c7:
            r17 = r3
            r32 = r14
            goto L_0x00f6
        L_0x00cc:
            r30 = r11
            r11 = r17
            goto L_0x00c7
        L_0x00d1:
            r30 = r11
            r11 = r17
            int r1 = r2.getVisibility()
            r17 = r3
            r3 = 8
            if (r1 != r3) goto L_0x010e
            int r1 = r9.e
            r2 = 1
            int r1 = r1 + r2
            r9.e = r1
            int r3 = r9.d
            int r3 = r3 + r2
            r9.d = r3
            r32 = r14
            int r14 = r13 + -1
            if (r10 != r14) goto L_0x00f6
            int r3 = r3 - r1
            if (r3 == 0) goto L_0x00f6
            r0.p(r8, r9, r10, r11)
        L_0x00f6:
            r2 = r31
            r24 = r5
            r22 = r6
            r21 = r7
            r5 = r8
            r8 = r11
            r20 = r13
            r1 = r19
            r3 = -1
            r7 = 1
            r6 = r29
            r11 = r30
            r19 = r12
            goto L_0x0488
        L_0x010e:
            r32 = r14
            boolean r1 = r2 instanceof android.widget.CompoundButton
            if (r1 == 0) goto L_0x014c
            r1 = r2
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            ym5 r3 = (defpackage.ym5) r3
            bn5 r3 = (defpackage.bn5) r3
            int r14 = r3.t0
            r20 = r13
            int r13 = r3.u0
            android.graphics.drawable.Drawable r1 = defpackage.gd3.a(r1)
            if (r1 != 0) goto L_0x012e
            r21 = 0
            goto L_0x0132
        L_0x012e:
            int r21 = r1.getMinimumWidth()
        L_0x0132:
            if (r1 != 0) goto L_0x0138
            r1 = -1
            r22 = 0
            goto L_0x013f
        L_0x0138:
            int r1 = r1.getMinimumHeight()
            r22 = r1
            r1 = -1
        L_0x013f:
            if (r14 != r1) goto L_0x0143
            r14 = r21
        L_0x0143:
            r3.t0 = r14
            if (r13 != r1) goto L_0x0149
            r13 = r22
        L_0x0149:
            r3.u0 = r13
            goto L_0x014e
        L_0x014c:
            r20 = r13
        L_0x014e:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            ym5 r1 = (defpackage.ym5) r1
            r3 = r1
            bn5 r3 = (defpackage.bn5) r3
            int r13 = r3.Z
            r14 = 4
            if (r13 != r14) goto L_0x0165
            java.util.ArrayList r13 = r9.j
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r13.add(r14)
        L_0x0165:
            if (r5 == 0) goto L_0x016a
            int r13 = r3.width
            goto L_0x016c
        L_0x016a:
            int r13 = r3.height
        L_0x016c:
            float r14 = r3.s0
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r21 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r21 == 0) goto L_0x0181
            r21 = r13
            r13 = 1073741824(0x40000000, float:2.0)
            if (r6 != r13) goto L_0x0183
            float r13 = (float) r7
            float r13 = r13 * r14
            int r13 = java.lang.Math.round(r13)
            goto L_0x0185
        L_0x0181:
            r21 = r13
        L_0x0183:
            r13 = r21
        L_0x0185:
            if (r5 == 0) goto L_0x01cb
            int r14 = r3.leftMargin
            int r14 = r14 + r12
            r21 = r7
            r7 = r1
            bn5 r7 = (defpackage.bn5) r7
            int r7 = r7.rightMargin
            int r7 = r7 + r14
            int r14 = r4.n
            r22 = r6
            int r6 = r4.l
            r23 = r8
            boolean r8 = r4.e()
            int r6 = androidx.recyclerview.widget.a.x(r8, r14, r6, r7, r13)
            int r14 = r32 + r15
            r7 = r1
            bn5 r7 = (defpackage.bn5) r7
            int r7 = r7.topMargin
            int r7 = r7 + r14
            r8 = r1
            bn5 r8 = (defpackage.bn5) r8
            int r8 = r8.bottomMargin
            int r8 = r8 + r7
            int r8 = r8 + r11
            r7 = r1
            bn5 r7 = (defpackage.bn5) r7
            int r7 = r7.height
            int r13 = r4.o
            int r14 = r4.m
            r24 = r5
            boolean r5 = r4.f()
            int r5 = androidx.recyclerview.widget.a.x(r5, r13, r14, r8, r7)
            r2.measure(r6, r5)
            r0.R(r2, r10, r6, r5)
            goto L_0x020e
        L_0x01cb:
            r24 = r5
            r22 = r6
            r21 = r7
            r23 = r8
            int r14 = r32 + r15
            int r5 = r3.leftMargin
            int r5 = r5 + r14
            r6 = r1
            bn5 r6 = (defpackage.bn5) r6
            int r6 = r6.rightMargin
            int r6 = r6 + r5
            int r6 = r6 + r11
            r5 = r1
            bn5 r5 = (defpackage.bn5) r5
            int r5 = r5.width
            int r7 = r4.n
            int r8 = r4.l
            boolean r14 = r4.e()
            int r5 = androidx.recyclerview.widget.a.x(r14, r7, r8, r6, r5)
            r6 = r1
            bn5 r6 = (defpackage.bn5) r6
            int r6 = r6.topMargin
            int r6 = r6 + r12
            r7 = r1
            bn5 r7 = (defpackage.bn5) r7
            int r7 = r7.bottomMargin
            int r7 = r7 + r6
            int r6 = r4.o
            int r8 = r4.m
            boolean r14 = r4.f()
            int r6 = androidx.recyclerview.widget.a.x(r14, r6, r8, r7, r13)
            r2.measure(r5, r6)
            r0.R(r2, r10, r5, r6)
        L_0x020e:
            r4.k1(r2, r10)
            r0.t(r2, r10)
            int r5 = r2.getMeasuredState()
            r7 = r18
            int r18 = android.view.View.combineMeasuredStates(r7, r5)
            int r5 = r9.a
            if (r24 == 0) goto L_0x0227
            int r7 = r2.getMeasuredWidth()
            goto L_0x022b
        L_0x0227:
            int r7 = r2.getMeasuredHeight()
        L_0x022b:
            if (r24 == 0) goto L_0x0230
            int r8 = r3.leftMargin
            goto L_0x0232
        L_0x0230:
            int r8 = r3.topMargin
        L_0x0232:
            int r8 = r8 + r7
            if (r24 == 0) goto L_0x023b
            r7 = r1
            bn5 r7 = (defpackage.bn5) r7
            int r7 = r7.rightMargin
            goto L_0x0240
        L_0x023b:
            r7 = r1
            bn5 r7 = (defpackage.bn5) r7
            int r7 = r7.bottomMargin
        L_0x0240:
            int r7 = r7 + r8
            int r8 = r23.size()
            int r13 = r4.q
            if (r13 != 0) goto L_0x024e
        L_0x0249:
            r5 = r23
            r6 = 1
            goto L_0x032e
        L_0x024e:
            boolean r13 = r3.x0
            if (r13 == 0) goto L_0x0255
            r7 = r21
            goto L_0x029b
        L_0x0255:
            if (r22 != 0) goto L_0x0258
            goto L_0x0249
        L_0x0258:
            int r13 = r4.s
            r14 = -1
            if (r13 == r14) goto L_0x0262
            r14 = 1
            int r8 = r8 + r14
            if (r13 > r8) goto L_0x0262
            goto L_0x0249
        L_0x0262:
            boolean r8 = r4.d1()
            if (r8 == 0) goto L_0x027e
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            pdc r8 = (defpackage.pdc) r8
            android.graphics.Rect r8 = r8.b
            int r8 = r8.left
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            pdc r13 = (defpackage.pdc) r13
            android.graphics.Rect r13 = r13.b
            int r13 = r13.right
        L_0x027c:
            int r8 = r8 + r13
            goto L_0x0293
        L_0x027e:
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            pdc r8 = (defpackage.pdc) r8
            android.graphics.Rect r8 = r8.b
            int r8 = r8.top
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            pdc r13 = (defpackage.pdc) r13
            android.graphics.Rect r13 = r13.b
            int r13 = r13.bottom
            goto L_0x027c
        L_0x0293:
            if (r8 <= 0) goto L_0x0296
            int r7 = r7 + r8
        L_0x0296:
            int r5 = r5 + r7
            r7 = r21
            if (r7 >= r5) goto L_0x032a
        L_0x029b:
            int r5 = r9.d
            int r8 = r9.e
            int r5 = r5 - r8
            if (r5 <= 0) goto L_0x02b4
            if (r10 <= 0) goto L_0x02aa
            r5 = 1
            int r8 = r10 + -1
            r5 = r23
            goto L_0x02ad
        L_0x02aa:
            r5 = r23
            r8 = 0
        L_0x02ad:
            r0.p(r5, r9, r8, r11)
            int r8 = r9.c
            int r8 = r8 + r11
            goto L_0x02b7
        L_0x02b4:
            r5 = r23
            r8 = r11
        L_0x02b7:
            if (r24 == 0) goto L_0x02ec
            int r9 = r3.height
            r11 = -1
            if (r9 != r11) goto L_0x02e9
            r9 = r17
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.a) r9
            int r11 = r9.L()
            int r9 = r9.I()
            int r9 = r9 + r11
            int r11 = r3.topMargin
            int r9 = r9 + r11
            int r11 = r3.bottomMargin
            int r9 = r9 + r11
            int r9 = r9 + r8
            int r11 = r3.height
            int r13 = r4.o
            int r14 = r4.m
            r21 = r7
            boolean r7 = r4.f()
            int r7 = androidx.recyclerview.widget.a.x(r7, r13, r14, r9, r11)
            r2.measure(r6, r7)
            r0.t(r2, r10)
            goto L_0x031b
        L_0x02e9:
            r21 = r7
            goto L_0x031b
        L_0x02ec:
            r21 = r7
            int r7 = r3.width
            r9 = -1
            if (r7 != r9) goto L_0x031b
            r7 = r17
            androidx.recyclerview.widget.a r7 = (androidx.recyclerview.widget.a) r7
            int r9 = r7.J()
            int r7 = r7.K()
            int r7 = r7 + r9
            int r9 = r3.leftMargin
            int r7 = r7 + r9
            int r9 = r3.rightMargin
            int r7 = r7 + r9
            int r7 = r7 + r8
            int r9 = r3.width
            int r11 = r4.n
            int r13 = r4.l
            boolean r14 = r4.e()
            int r7 = androidx.recyclerview.widget.a.x(r14, r11, r13, r7, r9)
            r2.measure(r7, r6)
            r0.t(r2, r10)
        L_0x031b:
            zm5 r9 = new zm5
            r9.<init>()
            r6 = 1
            r9.d = r6
            r9.a = r12
            r9.k = r10
            r6 = r16
            goto L_0x0336
        L_0x032a:
            r21 = r7
            goto L_0x0249
        L_0x032e:
            int r7 = r9.d
            int r7 = r7 + r6
            r9.d = r7
            r8 = r11
            r6 = r19
        L_0x0336:
            boolean r7 = r9.m
            float r11 = r3.X
            r13 = 0
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x0341
            r14 = 1
            goto L_0x0342
        L_0x0341:
            r14 = 0
        L_0x0342:
            r7 = r7 | r14
            r9.m = r7
            boolean r7 = r9.n
            float r14 = r3.Y
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x034f
            r13 = 1
            goto L_0x0350
        L_0x034f:
            r13 = 0
        L_0x0350:
            r7 = r7 | r13
            r9.n = r7
            java.lang.Object r7 = r0.c
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x035f
            int r13 = r5.size()
            r7[r10] = r13
        L_0x035f:
            int r7 = r9.a
            if (r24 == 0) goto L_0x0368
            int r13 = r2.getMeasuredWidth()
            goto L_0x036c
        L_0x0368:
            int r13 = r2.getMeasuredHeight()
        L_0x036c:
            if (r24 == 0) goto L_0x0376
            r19 = r12
            r12 = r1
            bn5 r12 = (defpackage.bn5) r12
            int r12 = r12.leftMargin
            goto L_0x037d
        L_0x0376:
            r19 = r12
            r12 = r1
            bn5 r12 = (defpackage.bn5) r12
            int r12 = r12.topMargin
        L_0x037d:
            int r12 = r12 + r13
            if (r24 == 0) goto L_0x0386
            r13 = r1
            bn5 r13 = (defpackage.bn5) r13
            int r13 = r13.rightMargin
            goto L_0x038b
        L_0x0386:
            r13 = r1
            bn5 r13 = (defpackage.bn5) r13
            int r13 = r13.bottomMargin
        L_0x038b:
            int r13 = r13 + r12
            int r13 = r13 + r7
            r9.a = r13
            float r7 = r9.f
            float r7 = r7 + r11
            r9.f = r7
            float r7 = r9.g
            float r7 = r7 + r14
            r9.g = r7
            android.graphics.Rect r7 = com.google.android.flexbox.FlexboxLayoutManager.N
            r4.d(r7, r2)
            boolean r7 = r4.d1()
            if (r7 == 0) goto L_0x03c4
            android.view.ViewGroup$LayoutParams r7 = r2.getLayoutParams()
            pdc r7 = (defpackage.pdc) r7
            android.graphics.Rect r7 = r7.b
            int r7 = r7.left
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            pdc r11 = (defpackage.pdc) r11
            android.graphics.Rect r11 = r11.b
            int r11 = r11.right
            int r7 = r7 + r11
            int r11 = r9.a
            int r11 = r11 + r7
            r9.a = r11
            int r11 = r9.b
            int r11 = r11 + r7
            r9.b = r11
            goto L_0x03e3
        L_0x03c4:
            android.view.ViewGroup$LayoutParams r7 = r2.getLayoutParams()
            pdc r7 = (defpackage.pdc) r7
            android.graphics.Rect r7 = r7.b
            int r7 = r7.top
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            pdc r11 = (defpackage.pdc) r11
            android.graphics.Rect r11 = r11.b
            int r11 = r11.bottom
            int r7 = r7 + r11
            int r11 = r9.a
            int r11 = r11 + r7
            r9.a = r11
            int r11 = r9.b
            int r11 = r11 + r7
            r9.b = r11
        L_0x03e3:
            if (r24 == 0) goto L_0x03ea
            int r7 = r2.getMeasuredHeight()
            goto L_0x03ee
        L_0x03ea:
            int r7 = r2.getMeasuredWidth()
        L_0x03ee:
            if (r24 == 0) goto L_0x03f6
            r11 = r1
            bn5 r11 = (defpackage.bn5) r11
            int r11 = r11.topMargin
            goto L_0x03fb
        L_0x03f6:
            r11 = r1
            bn5 r11 = (defpackage.bn5) r11
            int r11 = r11.leftMargin
        L_0x03fb:
            int r11 = r11 + r7
            if (r24 == 0) goto L_0x0403
            bn5 r1 = (defpackage.bn5) r1
            int r1 = r1.bottomMargin
            goto L_0x0407
        L_0x0403:
            bn5 r1 = (defpackage.bn5) r1
            int r1 = r1.rightMargin
        L_0x0407:
            int r1 = r1 + r11
            int r7 = r4.Y0(r2)
            int r7 = r7 + r1
            int r1 = java.lang.Math.max(r6, r7)
            int r6 = r9.c
            int r6 = java.lang.Math.max(r6, r1)
            r9.c = r6
            if (r24 == 0) goto L_0x042f
            int r6 = r4.q
            r7 = 2
            if (r6 == r7) goto L_0x0431
            int r6 = r9.h
            int r2 = r2.getBaseline()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r6, r2)
            r9.h = r2
        L_0x042f:
            r2 = 1
            goto L_0x0446
        L_0x0431:
            int r6 = r9.h
            int r7 = r2.getMeasuredHeight()
            int r2 = r2.getBaseline()
            int r7 = r7 - r2
            int r2 = r3.bottomMargin
            int r7 = r7 + r2
            int r2 = java.lang.Math.max(r6, r7)
            r9.h = r2
            goto L_0x042f
        L_0x0446:
            int r13 = r20 + -1
            if (r10 != r13) goto L_0x0457
            int r2 = r9.d
            int r3 = r9.e
            int r2 = r2 - r3
            if (r2 == 0) goto L_0x0457
            r0.p(r5, r9, r10, r8)
            int r2 = r9.c
            int r8 = r8 + r2
        L_0x0457:
            r2 = r31
            r3 = -1
            if (r2 == r3) goto L_0x047e
            int r6 = r5.size()
            if (r6 <= 0) goto L_0x047e
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            java.lang.Object r6 = r5.get(r6)
            zm5 r6 = (defpackage.zm5) r6
            int r6 = r6.l
            if (r6 < r2) goto L_0x047e
            if (r10 < r2) goto L_0x047e
            if (r30 != 0) goto L_0x047e
            int r6 = r9.c
            int r6 = -r6
            r8 = r6
            r11 = 1
            r6 = r29
            goto L_0x0482
        L_0x047e:
            r6 = r29
            r11 = r30
        L_0x0482:
            if (r8 <= r6) goto L_0x0487
            if (r11 == 0) goto L_0x0487
            goto L_0x049f
        L_0x0487:
            r7 = 1
        L_0x0488:
            int r10 = r10 + r7
            r14 = r32
            r3 = r17
            r12 = r19
            r13 = r20
            r7 = r21
            r6 = r22
            r19 = r1
            r1 = r2
            r17 = r8
            r8 = r5
            r5 = r24
            goto L_0x00ab
        L_0x049f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l84.s(wd6, int, int, int, int, int, java.util.List):void");
    }

    public void t(View view, int i) {
        boolean z;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        bn5 bn5 = (bn5) ((ym5) view.getLayoutParams());
        int i2 = bn5.t0;
        boolean z2 = true;
        if (measuredWidth >= i2 && measuredWidth <= (i2 = bn5.v0)) {
            z = false;
        } else {
            measuredWidth = i2;
            z = true;
        }
        int i3 = bn5.u0;
        if (measuredHeight < i3) {
            measuredHeight = i3;
        } else {
            int i4 = bn5.w0;
            if (measuredHeight > i4) {
                measuredHeight = i4;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            R(view, i, makeMeasureSpec, makeMeasureSpec2);
            ((FlexboxLayoutManager) ((xm5) this.a)).k1(view, i);
        }
    }

    public void u(int i, List list) {
        int i2 = ((int[]) this.c)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    public void v(int i, int i2, int i3) {
        int i4;
        int J;
        int K;
        xm5 xm5 = (xm5) this.a;
        int b2 = ((FlexboxLayoutManager) xm5).y.b();
        boolean[] zArr = (boolean[]) this.b;
        int i5 = 0;
        if (zArr == null) {
            this.b = new boolean[Math.max(b2, 10)];
        } else if (zArr.length < b2) {
            this.b = new boolean[Math.max(zArr.length * 2, b2)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 < ((FlexboxLayoutManager) xm5).y.b()) {
            int i6 = ((FlexboxLayoutManager) xm5).p;
            int i7 = ((FlexboxLayoutManager) xm5).p;
            if (i7 == 0 || i7 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int a1 = ((FlexboxLayoutManager) xm5).a1();
                if (mode != 1073741824) {
                    size = Math.min(a1, size);
                }
                J = ((a) xm5).J();
                K = ((a) xm5).K();
            } else if (i7 == 2 || i7 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i4 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i4 = ((FlexboxLayoutManager) xm5).a1();
                }
                J = ((a) xm5).L();
                K = ((a) xm5).I();
            } else {
                throw new IllegalArgumentException(zr6.h(i6, "Invalid flex direction: "));
            }
            int i8 = K + J;
            int[] iArr = (int[]) this.c;
            if (iArr != null) {
                i5 = iArr[i3];
            }
            List list = ((FlexboxLayoutManager) xm5).v;
            int size2 = list.size();
            while (i5 < size2) {
                zm5 zm5 = (zm5) list.get(i5);
                int i9 = zm5.a;
                if (i9 < i4 && zm5.m) {
                    z(i, i2, zm5, i4, i8, false);
                } else if (i9 > i4 && zm5.n) {
                    M(i, i2, zm5, i4, i8, false);
                }
                i5++;
            }
        }
    }

    public void w(int i) {
        int[] iArr = (int[]) this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf((int[]) this.c, Math.max(iArr.length * 2, i));
        }
    }

    public void x(int i) {
        long[] jArr = (long[]) this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf((long[]) this.d, Math.max(jArr.length * 2, i));
        }
    }

    public void y(int i) {
        long[] jArr = (long[]) this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = Arrays.copyOf((long[]) this.e, Math.max(jArr.length * 2, i));
        }
    }

    public void z(int i, int i2, zm5 zm5, int i3, int i4, boolean z) {
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        double d2;
        int i9;
        int i10;
        double d3;
        zm5 zm52 = zm5;
        int i11 = i3;
        float f2 = zm52.f;
        boolean z3 = false;
        if (f2 > 0.0f && i11 >= (i5 = zm52.a)) {
            float f3 = ((float) (i11 - i5)) / f2;
            zm52.a = i4 + zm52.b;
            if (!z) {
                zm52.c = Integer.MIN_VALUE;
            }
            int i12 = 0;
            boolean z4 = false;
            int i13 = 0;
            float f4 = 0.0f;
            while (i12 < zm52.d) {
                int i14 = zm52.k + i12;
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((xm5) this.a);
                View Z0 = flexboxLayoutManager.Z0(i14);
                if (Z0 == null || Z0.getVisibility() == 8) {
                    int i15 = i2;
                    z2 = z3;
                    i7 = i5;
                    i6 = i12;
                } else {
                    ym5 ym5 = (ym5) Z0.getLayoutParams();
                    int i16 = flexboxLayoutManager.p;
                    if (i16 == 0 || i16 == 1) {
                        int i17 = i;
                        int i18 = i5;
                        i6 = i12;
                        int measuredWidth = Z0.getMeasuredWidth();
                        long[] jArr = (long[]) this.e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i14];
                        }
                        int measuredHeight = Z0.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.e;
                        if (jArr2 != null) {
                            long j = jArr2[i14];
                            i7 = i18;
                            measuredHeight = (int) (j >> 32);
                        } else {
                            i7 = i18;
                        }
                        if (!((boolean[]) this.b)[i14]) {
                            bn5 bn5 = (bn5) ym5;
                            float f5 = bn5.X;
                            z2 = false;
                            if (f5 > 0.0f) {
                                float f6 = (f3 * f5) + ((float) measuredWidth);
                                if (i6 == zm52.d - 1) {
                                    f6 += f4;
                                    f4 = 0.0f;
                                }
                                int round = Math.round(f6);
                                int i19 = bn5.v0;
                                if (round > i19) {
                                    ((boolean[]) this.b)[i14] = true;
                                    zm52.f -= f5;
                                    round = i19;
                                    z4 = true;
                                } else {
                                    float f7 = (f6 - ((float) round)) + f4;
                                    double d4 = (double) f7;
                                    if (d4 > 1.0d) {
                                        round++;
                                        d2 = d4 - 1.0d;
                                    } else {
                                        if (d4 < -1.0d) {
                                            round--;
                                            d2 = d4 + 1.0d;
                                        }
                                        f4 = f7;
                                    }
                                    f7 = (float) d2;
                                    f4 = f7;
                                }
                                int B = B(i2, ym5, zm52.i);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                Z0.measure(makeMeasureSpec, B);
                                int measuredWidth2 = Z0.getMeasuredWidth();
                                int measuredHeight2 = Z0.getMeasuredHeight();
                                R(Z0, i14, makeMeasureSpec, B);
                                flexboxLayoutManager.k1(Z0, i14);
                                measuredWidth = measuredWidth2;
                                measuredHeight = measuredHeight2;
                            } else {
                                int i20 = i2;
                            }
                        } else {
                            int i21 = i2;
                            z2 = false;
                        }
                        bn5 bn52 = (bn5) ym5;
                        int max = Math.max(i13, flexboxLayoutManager.Y0(Z0) + measuredHeight + bn52.topMargin + bn52.bottomMargin);
                        zm52.a = measuredWidth + bn52.leftMargin + bn52.rightMargin + zm52.a;
                        i8 = max;
                    } else {
                        int measuredHeight3 = Z0.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.e;
                        if (jArr3 != null) {
                            long j2 = jArr3[i14];
                            i9 = i5;
                            measuredHeight3 = (int) (j2 >> 32);
                        } else {
                            i9 = i5;
                        }
                        int measuredWidth3 = Z0.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i14];
                        }
                        if (!((boolean[]) this.b)[i14]) {
                            bn5 bn53 = (bn5) ym5;
                            float f8 = bn53.X;
                            if (f8 > 0.0f) {
                                float f9 = (f3 * f8) + ((float) measuredHeight3);
                                if (i12 == zm52.d - 1) {
                                    f9 += f4;
                                    f4 = 0.0f;
                                }
                                int round2 = Math.round(f9);
                                int i22 = bn53.w0;
                                if (round2 > i22) {
                                    ((boolean[]) this.b)[i14] = true;
                                    zm52.f -= f8;
                                    i10 = i9;
                                    round2 = i22;
                                    z4 = true;
                                    i6 = i12;
                                } else {
                                    float f10 = (f9 - ((float) round2)) + f4;
                                    i6 = i12;
                                    i10 = i9;
                                    double d5 = (double) f10;
                                    if (d5 > 1.0d) {
                                        round2++;
                                        d3 = d5 - 1.0d;
                                    } else if (d5 < -1.0d) {
                                        round2--;
                                        d3 = d5 + 1.0d;
                                    } else {
                                        f4 = f10;
                                    }
                                    f4 = (float) d3;
                                }
                                int C = C(i, ym5, zm52.i);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                Z0.measure(C, makeMeasureSpec2);
                                int measuredWidth4 = Z0.getMeasuredWidth();
                                int measuredHeight4 = Z0.getMeasuredHeight();
                                R(Z0, i14, C, makeMeasureSpec2);
                                flexboxLayoutManager.k1(Z0, i14);
                                measuredWidth3 = measuredWidth4;
                                measuredHeight3 = measuredHeight4;
                                bn5 bn54 = (bn5) ym5;
                                i8 = Math.max(i13, flexboxLayoutManager.Y0(Z0) + measuredWidth3 + bn54.leftMargin + bn54.rightMargin);
                                zm52.a = measuredHeight3 + bn54.topMargin + bn54.bottomMargin + zm52.a;
                                int i23 = i2;
                                i7 = i10;
                                z2 = false;
                            }
                        }
                        i6 = i12;
                        i10 = i9;
                        int i24 = i;
                        bn5 bn542 = (bn5) ym5;
                        i8 = Math.max(i13, flexboxLayoutManager.Y0(Z0) + measuredWidth3 + bn542.leftMargin + bn542.rightMargin);
                        zm52.a = measuredHeight3 + bn542.topMargin + bn542.bottomMargin + zm52.a;
                        int i232 = i2;
                        i7 = i10;
                        z2 = false;
                    }
                    zm52.c = Math.max(zm52.c, i8);
                    i13 = i8;
                }
                i12 = i6 + 1;
                i5 = i7;
                z3 = z2;
                int i25 = i3;
            }
            int i26 = i2;
            int i27 = i5;
            if (z4 && i27 != zm52.a) {
                z(i, i2, zm5, i3, i4, true);
            }
        }
    }
}
