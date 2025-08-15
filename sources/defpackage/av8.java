package defpackage;

/* renamed from: av8  reason: default package */
public enum av8 {
    POSFIXINT(3),
    FIXMAP(8),
    FIXARRAY(7),
    FIXSTR(5),
    NIL(1),
    NEVER_USED(0),
    BOOLEAN(2),
    BIN8(6),
    BIN16(6),
    BIN32(6),
    EXT8(9),
    EXT16(9),
    EXT32(9),
    FLOAT32(4),
    FLOAT64(4),
    UINT8(3),
    UINT16(3),
    UINT32(3),
    UINT64(3),
    INT8(3),
    INT16(3),
    INT32(3),
    INT64(3),
    FIXEXT1(9),
    FIXEXT2(9),
    FIXEXT4(9),
    FIXEXT8(9),
    FIXEXT16(9),
    STR8(5),
    STR16(5),
    STR32(5),
    ARRAY16(7),
    ARRAY32(7),
    MAP16(8),
    MAP32(8),
    NEGFIXINT(3);
    
    public static final av8[] W0 = null;
    public final int a;

    static {
        av8 av8;
        W0 = new av8[256];
        for (int i = 0; i <= 255; i++) {
            byte b = (byte) i;
            if ((b & Byte.MIN_VALUE) != 0) {
                byte b2 = b & -32;
                if (b2 != -32) {
                    if (b2 != -96) {
                        byte b3 = b & -16;
                        if (b3 != -112) {
                            if (b3 != Byte.MIN_VALUE) {
                                switch (b) {
                                    case -64:
                                        av8 = NIL;
                                        break;
                                    case -62:
                                    case -61:
                                        av8 = BOOLEAN;
                                        break;
                                    case -60:
                                        av8 = BIN8;
                                        break;
                                    case -59:
                                        av8 = BIN16;
                                        break;
                                    case -58:
                                        av8 = BIN32;
                                        break;
                                    case -57:
                                        av8 = EXT8;
                                        break;
                                    case -56:
                                        av8 = EXT16;
                                        break;
                                    case -55:
                                        av8 = EXT32;
                                        break;
                                    case -54:
                                        av8 = FLOAT32;
                                        break;
                                    case -53:
                                        av8 = FLOAT64;
                                        break;
                                    case -52:
                                        av8 = UINT8;
                                        break;
                                    case -51:
                                        av8 = UINT16;
                                        break;
                                    case -50:
                                        av8 = UINT32;
                                        break;
                                    case -49:
                                        av8 = UINT64;
                                        break;
                                    case -48:
                                        av8 = INT8;
                                        break;
                                    case -47:
                                        av8 = INT16;
                                        break;
                                    case -46:
                                        av8 = INT32;
                                        break;
                                    case -45:
                                        av8 = INT64;
                                        break;
                                    case -44:
                                        av8 = FIXEXT1;
                                        break;
                                    case -43:
                                        av8 = FIXEXT2;
                                        break;
                                    case -42:
                                        av8 = FIXEXT4;
                                        break;
                                    case -41:
                                        av8 = FIXEXT8;
                                        break;
                                    case -40:
                                        av8 = FIXEXT16;
                                        break;
                                    case -39:
                                        av8 = STR8;
                                        break;
                                    case -38:
                                        av8 = STR16;
                                        break;
                                    case -37:
                                        av8 = STR32;
                                        break;
                                    case -36:
                                        av8 = ARRAY16;
                                        break;
                                    case -35:
                                        av8 = ARRAY32;
                                        break;
                                    case -34:
                                        av8 = MAP16;
                                        break;
                                    case -33:
                                        av8 = MAP32;
                                        break;
                                    default:
                                        av8 = NEVER_USED;
                                        break;
                                }
                            } else {
                                av8 = FIXMAP;
                            }
                        } else {
                            av8 = FIXARRAY;
                        }
                    } else {
                        av8 = FIXSTR;
                    }
                } else {
                    av8 = NEGFIXINT;
                }
            } else {
                av8 = POSFIXINT;
            }
            W0[i] = av8;
        }
    }

    /* access modifiers changed from: public */
    av8(int i) {
        this.a = i;
    }

    public final int a() {
        if (this != NEVER_USED) {
            return this.a;
        }
        throw new RuntimeException("Cannot convert NEVER_USED to ValueType");
    }
}
