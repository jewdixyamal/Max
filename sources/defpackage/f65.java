package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f65  reason: default package */
public final class f65 extends FilterOutputStream {
    public static final byte[] Z = "Exif\u0000\u0000".getBytes(q55.d);
    public int X;
    public int Y;
    public final u55 a;
    public final byte[] b = new byte[1];
    public final ByteBuffer c = ByteBuffer.allocate(4);
    public int o = 0;

    public f65(ByteArrayOutputStream byteArrayOutputStream, u55 u55) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.a = u55;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        u55 u55;
        int i5;
        byte[] bArr2 = bArr;
        int i6 = 0;
        int i7 = 1;
        int i8 = i;
        int i9 = i2;
        while (true) {
            int i10 = this.X;
            if ((i10 > 0 || this.Y > 0 || this.o != 2) && i9 > 0) {
                if (i10 > 0) {
                    int min = Math.min(i9, i10);
                    i9 -= min;
                    this.X -= min;
                    i8 += min;
                }
                int i11 = this.Y;
                if (i11 > 0) {
                    int min2 = Math.min(i9, i11);
                    this.out.write(bArr2, i8, min2);
                    i9 -= min2;
                    this.Y -= min2;
                    i8 += min2;
                }
                if (i9 != 0) {
                    int i12 = this.o;
                    int i13 = 4;
                    ByteBuffer byteBuffer = this.c;
                    if (i12 != 0) {
                        if (i12 == i7) {
                            int min3 = Math.min(i9, 4 - byteBuffer.position());
                            byteBuffer.put(bArr2, i8, min3);
                            i8 += min3;
                            i9 -= min3;
                            if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                                this.out.write(byteBuffer.array(), i6, 2);
                                byteBuffer.rewind();
                            }
                            if (byteBuffer.position() >= 4) {
                                byteBuffer.rewind();
                                short s = byteBuffer.getShort();
                                if (s == -31) {
                                    this.X = (byteBuffer.getShort() & 65535) - 2;
                                    this.o = 2;
                                } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                                    this.out.write(byteBuffer.array(), i6, 4);
                                    this.Y = (byteBuffer.getShort() & 65535) - 2;
                                } else {
                                    this.out.write(byteBuffer.array(), i6, 4);
                                    this.o = 2;
                                }
                                byteBuffer.rewind();
                            } else {
                                return;
                            }
                        }
                        i3 = i6;
                        i4 = i7;
                    } else {
                        int min4 = Math.min(i9, 2 - byteBuffer.position());
                        byteBuffer.put(bArr2, i8, min4);
                        i8 += min4;
                        i9 -= min4;
                        if (byteBuffer.position() >= 2) {
                            byteBuffer.rewind();
                            if (byteBuffer.getShort() == -40) {
                                this.out.write(byteBuffer.array(), i6, 2);
                                this.o = i7;
                                byteBuffer.rewind();
                                uv0 uv0 = new uv0(this.out, ByteOrder.BIG_ENDIAN, i6);
                                uv0.g(-31);
                                int[] iArr = new int[4];
                                int[] iArr2 = new int[4];
                                g65[] g65Arr = u55.c;
                                int i14 = i6;
                                while (true) {
                                    u55 = this.a;
                                    if (i14 >= i13) {
                                        break;
                                    }
                                    g65 g65 = g65Arr[i14];
                                    int i15 = i6;
                                    while (true) {
                                        g65[] g65Arr2 = u55.c;
                                        if (i15 >= i13) {
                                            break;
                                        }
                                        u55.a(i15).remove(g65.b);
                                        i15 += i7;
                                        i13 = 4;
                                    }
                                    i14 += i7;
                                    i13 = 4;
                                }
                                boolean isEmpty = u55.a(i7).isEmpty();
                                ByteOrder byteOrder = u55.b;
                                if (!isEmpty) {
                                    u55.a(i6).put(u55.c[i7].b, q55.a(0, byteOrder));
                                }
                                if (!u55.a(2).isEmpty()) {
                                    u55.a(i6).put(u55.c[2].b, q55.a(0, byteOrder));
                                }
                                if (!u55.a(3).isEmpty()) {
                                    u55.a(i7).put(u55.c[3].b, q55.a(0, byteOrder));
                                }
                                int i16 = i6;
                                while (true) {
                                    g65[] g65Arr3 = u55.c;
                                    if (i16 >= 4) {
                                        break;
                                    }
                                    int i17 = i6;
                                    for (Map.Entry value : u55.a(i16).entrySet()) {
                                        q55 q55 = (q55) value.getValue();
                                        int i18 = q55.f[q55.a] * q55.b;
                                        if (i18 > 4) {
                                            i17 += i18;
                                        }
                                    }
                                    iArr2[i16] = iArr2[i16] + i17;
                                    i16 += i7;
                                    i6 = 0;
                                }
                                int i19 = 0;
                                int i20 = 8;
                                while (true) {
                                    g65[] g65Arr4 = u55.c;
                                    if (i19 >= 4) {
                                        break;
                                    }
                                    if (!u55.a(i19).isEmpty()) {
                                        iArr[i19] = i20;
                                        i20 += (u55.a(i19).size() * 12) + 6 + iArr2[i19];
                                    }
                                    i19 += i7;
                                }
                                int i21 = i20 + 8;
                                if (!u55.a(i7).isEmpty()) {
                                    u55.a(0).put(u55.c[i7].b, q55.a((long) iArr[i7], byteOrder));
                                }
                                if (!u55.a(2).isEmpty()) {
                                    i5 = i21;
                                    u55.a(0).put(u55.c[2].b, q55.a((long) iArr[2], byteOrder));
                                } else {
                                    i5 = i21;
                                }
                                if (!u55.a(3).isEmpty()) {
                                    u55.a(i7).put(u55.c[3].b, q55.a((long) iArr[3], byteOrder));
                                }
                                uv0.g((short) i5);
                                uv0.write(Z);
                                uv0.g(byteOrder == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
                                uv0.c = byteOrder;
                                uv0.g((short) 42);
                                uv0.d((int) 8);
                                int i22 = 0;
                                while (true) {
                                    g65[] g65Arr5 = u55.c;
                                    if (i22 >= 4) {
                                        break;
                                    }
                                    if (!u55.a(i22).isEmpty()) {
                                        uv0.g((short) u55.a(i22).size());
                                        int size = (u55.a(i22).size() * 12) + iArr[i22] + 2 + 4;
                                        for (Map.Entry entry : u55.a(i22).entrySet()) {
                                            g65 g652 = (g65) ((HashMap) t55.f.get(i22)).get(entry.getKey());
                                            c54.o(g652, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                                            q55 q552 = (q55) entry.getValue();
                                            int i23 = q55.f[q552.a];
                                            int i24 = q552.b;
                                            int i25 = i23 * i24;
                                            uv0.g((short) g652.a);
                                            uv0.g((short) q552.a);
                                            uv0.d(i24);
                                            if (i25 > 4) {
                                                uv0.d((int) ((long) size));
                                                size += i25;
                                            } else {
                                                uv0.write(q552.c);
                                                if (i25 < 4) {
                                                    for (int i26 = 4; i25 < i26; i26 = 4) {
                                                        uv0.b.write(0);
                                                        i25++;
                                                    }
                                                }
                                            }
                                        }
                                        uv0.d((int) 0);
                                        for (Map.Entry value2 : u55.a(i22).entrySet()) {
                                            byte[] bArr3 = ((q55) value2.getValue()).c;
                                            if (bArr3.length > 4) {
                                                uv0.write(bArr3, 0, bArr3.length);
                                            }
                                        }
                                    }
                                    i22++;
                                    i7 = 1;
                                }
                                i4 = i7;
                                i3 = 0;
                                uv0.c = ByteOrder.BIG_ENDIAN;
                            } else {
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                        } else {
                            return;
                        }
                    }
                    i7 = i4;
                    i6 = i3;
                } else {
                    return;
                }
            }
        }
        if (i9 > 0) {
            this.out.write(bArr2, i8, i9);
        }
    }

    public final void write(int i) {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
