


import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked" })
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-14")
public class rsp_t implements org.apache.thrift.TBase<rsp_t, rsp_t._Fields>, java.io.Serializable, Cloneable,
        Comparable<rsp_t> {

    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
            "rsp_t");

    private static final org.apache.thrift.protocol.TField ERR_NO_FIELD_DESC = new org.apache.thrift.protocol.TField(
            "err_no", org.apache.thrift.protocol.TType.I32, (short) 1);

    private static final org.apache.thrift.protocol.TField SVR_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField(
            "svr_name", org.apache.thrift.protocol.TType.STRING, (short) 2);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
        schemes.put(StandardScheme.class, new rsp_tStandardSchemeFactory());
        schemes.put(TupleScheme.class, new rsp_tTupleSchemeFactory());
    }

    public int err_no; // required

    public String svr_name; // required

    /**
     * The set of fields this struct contains, along with convenience methods
     * for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        ERR_NO((short) 1, "err_no"), SVR_NAME((short) 2, "svr_name");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not
         * found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // ERR_NO
                    return ERR_NO;
                case 2: // SVR_NAME
                    return SVR_NAME;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null)
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not
         * found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;

        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        @Override
        public short getThriftFieldId() {
            return _thriftId;
        }

        @Override
        public String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __ERR_NO_ISSET_ID = 0;

    private byte __isset_bitfield = 0;

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
                _Fields.class);
        tmpMap.put(_Fields.ERR_NO, new org.apache.thrift.meta_data.FieldMetaData("err_no",
                org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(
                        org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.SVR_NAME, new org.apache.thrift.meta_data.FieldMetaData("svr_name",
                org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(
                        org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(rsp_t.class, metaDataMap);
    }

    public rsp_t() {
    }

    public rsp_t(int err_no, String svr_name) {
        this();
        this.err_no = err_no;
        setErr_noIsSet(true);
        this.svr_name = svr_name;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public rsp_t(rsp_t other) {
        __isset_bitfield = other.__isset_bitfield;
        this.err_no = other.err_no;
        if (other.isSetSvr_name()) {
            this.svr_name = other.svr_name;
        }
    }

    @Override
    public rsp_t deepCopy() {
        return new rsp_t(this);
    }

    @Override
    public void clear() {
        setErr_noIsSet(false);
        this.err_no = 0;
        this.svr_name = null;
    }

    public int getErr_no() {
        return this.err_no;
    }

    public rsp_t setErr_no(int err_no) {
        this.err_no = err_no;
        setErr_noIsSet(true);
        return this;
    }

    public void unsetErr_no() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ERR_NO_ISSET_ID);
    }

    /**
     * Returns true if field err_no is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetErr_no() {
        return EncodingUtils.testBit(__isset_bitfield, __ERR_NO_ISSET_ID);
    }

    public void setErr_noIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ERR_NO_ISSET_ID, value);
    }

    public String getSvr_name() {
        return this.svr_name;
    }

    public rsp_t setSvr_name(String svr_name) {
        this.svr_name = svr_name;
        return this;
    }

    public void unsetSvr_name() {
        this.svr_name = null;
    }

    /**
     * Returns true if field svr_name is set (has been assigned a value) and
     * false otherwise
     */
    public boolean isSetSvr_name() {
        return this.svr_name != null;
    }

    public void setSvr_nameIsSet(boolean value) {
        if (!value) {
            this.svr_name = null;
        }
    }

    @Override
    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case ERR_NO:
                if (value == null) {
                    unsetErr_no();
                } else {
                    setErr_no((Integer) value);
                }
                break;

            case SVR_NAME:
                if (value == null) {
                    unsetSvr_name();
                } else {
                    setSvr_name((String) value);
                }
                break;

        }
    }

    @Override
    public Object getFieldValue(_Fields field) {
        switch (field) {
            case ERR_NO:
                return Integer.valueOf(getErr_no());

            case SVR_NAME:
                return getSvr_name();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned
     * a value) and false otherwise
     */
    @Override
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case ERR_NO:
                return isSetErr_no();
            case SVR_NAME:
                return isSetSvr_name();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof rsp_t)
            return this.equals((rsp_t) that);
        return false;
    }

    public boolean equals(rsp_t that) {
        if (that == null)
            return false;

        boolean this_present_err_no = true;
        boolean that_present_err_no = true;
        if (this_present_err_no || that_present_err_no) {
            if (!(this_present_err_no && that_present_err_no))
                return false;
            if (this.err_no != that.err_no)
                return false;
        }

        boolean this_present_svr_name = true && this.isSetSvr_name();
        boolean that_present_svr_name = true && that.isSetSvr_name();
        if (this_present_svr_name || that_present_svr_name) {
            if (!(this_present_svr_name && that_present_svr_name))
                return false;
            if (!this.svr_name.equals(that.svr_name))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_err_no = true;
        list.add(present_err_no);
        if (present_err_no)
            list.add(err_no);

        boolean present_svr_name = true && (isSetSvr_name());
        list.add(present_svr_name);
        if (present_svr_name)
            list.add(svr_name);

        return list.hashCode();
    }

    @Override
    public int compareTo(rsp_t other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetErr_no()).compareTo(other.isSetErr_no());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetErr_no()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.err_no, other.err_no);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetSvr_name()).compareTo(other.isSetSvr_name());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSvr_name()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.svr_name, other.svr_name);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    @Override
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("rsp_t(");
        boolean first = true;

        sb.append("err_no:");
        sb.append(this.err_no);
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("svr_name:");
        if (this.svr_name == null) {
            sb.append("null");
        } else {
            sb.append(this.svr_name);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(
                    out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class rsp_tStandardSchemeFactory implements SchemeFactory {

        @Override
        public rsp_tStandardScheme getScheme() {
            return new rsp_tStandardScheme();
        }
    }

    private static class rsp_tStandardScheme extends StandardScheme<rsp_t> {

        @Override
        public void read(org.apache.thrift.protocol.TProtocol iprot, rsp_t struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // ERR_NO
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.err_no = iprot.readI32();
                            struct.setErr_noIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // SVR_NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.svr_name = iprot.readString();
                            struct.setSvr_nameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        @Override
        public void write(org.apache.thrift.protocol.TProtocol oprot, rsp_t struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(ERR_NO_FIELD_DESC);
            oprot.writeI32(struct.err_no);
            oprot.writeFieldEnd();
            if (struct.svr_name != null) {
                oprot.writeFieldBegin(SVR_NAME_FIELD_DESC);
                oprot.writeString(struct.svr_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class rsp_tTupleSchemeFactory implements SchemeFactory {

        @Override
        public rsp_tTupleScheme getScheme() {
            return new rsp_tTupleScheme();
        }
    }

    private static class rsp_tTupleScheme extends TupleScheme<rsp_t> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, rsp_t struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetErr_no()) {
                optionals.set(0);
            }
            if (struct.isSetSvr_name()) {
                optionals.set(1);
            }
            oprot.writeBitSet(optionals, 2);
            if (struct.isSetErr_no()) {
                oprot.writeI32(struct.err_no);
            }
            if (struct.isSetSvr_name()) {
                oprot.writeString(struct.svr_name);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, rsp_t struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(2);
            if (incoming.get(0)) {
                struct.err_no = iprot.readI32();
                struct.setErr_noIsSet(true);
            }
            if (incoming.get(1)) {
                struct.svr_name = iprot.readString();
                struct.setSvr_nameIsSet(true);
            }
        }
    }

}
