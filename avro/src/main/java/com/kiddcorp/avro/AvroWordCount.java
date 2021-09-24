/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.kiddcorp.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class AvroWordCount extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2658723847263727408L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroWordCount\",\"namespace\":\"com.kiddcorp.avro\",\"fields\":[{\"name\":\"word\",\"type\":\"string\"},{\"name\":\"wordcount\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroWordCount> ENCODER =
      new BinaryMessageEncoder<AvroWordCount>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroWordCount> DECODER =
      new BinaryMessageDecoder<AvroWordCount>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AvroWordCount> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AvroWordCount> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AvroWordCount> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroWordCount>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AvroWordCount to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AvroWordCount from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AvroWordCount instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AvroWordCount fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence word;
  @Deprecated public int wordcount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroWordCount() {}

  /**
   * All-args constructor.
   * @param word The new value for word
   * @param wordcount The new value for wordcount
   */
  public AvroWordCount(java.lang.CharSequence word, java.lang.Integer wordcount) {
    this.word = word;
    this.wordcount = wordcount;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return word;
    case 1: return wordcount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: word = (java.lang.CharSequence)value$; break;
    case 1: wordcount = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'word' field.
   * @return The value of the 'word' field.
   */
  public java.lang.CharSequence getWord() {
    return word;
  }


  /**
   * Sets the value of the 'word' field.
   * @param value the value to set.
   */
  public void setWord(java.lang.CharSequence value) {
    this.word = value;
  }

  /**
   * Gets the value of the 'wordcount' field.
   * @return The value of the 'wordcount' field.
   */
  public int getWordcount() {
    return wordcount;
  }


  /**
   * Sets the value of the 'wordcount' field.
   * @param value the value to set.
   */
  public void setWordcount(int value) {
    this.wordcount = value;
  }

  /**
   * Creates a new AvroWordCount RecordBuilder.
   * @return A new AvroWordCount RecordBuilder
   */
  public static com.kiddcorp.avro.AvroWordCount.Builder newBuilder() {
    return new com.kiddcorp.avro.AvroWordCount.Builder();
  }

  /**
   * Creates a new AvroWordCount RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroWordCount RecordBuilder
   */
  public static com.kiddcorp.avro.AvroWordCount.Builder newBuilder(com.kiddcorp.avro.AvroWordCount.Builder other) {
    if (other == null) {
      return new com.kiddcorp.avro.AvroWordCount.Builder();
    } else {
      return new com.kiddcorp.avro.AvroWordCount.Builder(other);
    }
  }

  /**
   * Creates a new AvroWordCount RecordBuilder by copying an existing AvroWordCount instance.
   * @param other The existing instance to copy.
   * @return A new AvroWordCount RecordBuilder
   */
  public static com.kiddcorp.avro.AvroWordCount.Builder newBuilder(com.kiddcorp.avro.AvroWordCount other) {
    if (other == null) {
      return new com.kiddcorp.avro.AvroWordCount.Builder();
    } else {
      return new com.kiddcorp.avro.AvroWordCount.Builder(other);
    }
  }

  /**
   * RecordBuilder for AvroWordCount instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroWordCount>
    implements org.apache.avro.data.RecordBuilder<AvroWordCount> {

    private java.lang.CharSequence word;
    private int wordcount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kiddcorp.avro.AvroWordCount.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.word)) {
        this.word = data().deepCopy(fields()[0].schema(), other.word);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.wordcount)) {
        this.wordcount = data().deepCopy(fields()[1].schema(), other.wordcount);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing AvroWordCount instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kiddcorp.avro.AvroWordCount other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.word)) {
        this.word = data().deepCopy(fields()[0].schema(), other.word);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.wordcount)) {
        this.wordcount = data().deepCopy(fields()[1].schema(), other.wordcount);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'word' field.
      * @return The value.
      */
    public java.lang.CharSequence getWord() {
      return word;
    }


    /**
      * Sets the value of the 'word' field.
      * @param value The value of 'word'.
      * @return This builder.
      */
    public com.kiddcorp.avro.AvroWordCount.Builder setWord(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.word = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'word' field has been set.
      * @return True if the 'word' field has been set, false otherwise.
      */
    public boolean hasWord() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'word' field.
      * @return This builder.
      */
    public com.kiddcorp.avro.AvroWordCount.Builder clearWord() {
      word = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'wordcount' field.
      * @return The value.
      */
    public int getWordcount() {
      return wordcount;
    }


    /**
      * Sets the value of the 'wordcount' field.
      * @param value The value of 'wordcount'.
      * @return This builder.
      */
    public com.kiddcorp.avro.AvroWordCount.Builder setWordcount(int value) {
      validate(fields()[1], value);
      this.wordcount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'wordcount' field has been set.
      * @return True if the 'wordcount' field has been set, false otherwise.
      */
    public boolean hasWordcount() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'wordcount' field.
      * @return This builder.
      */
    public com.kiddcorp.avro.AvroWordCount.Builder clearWordcount() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroWordCount build() {
      try {
        AvroWordCount record = new AvroWordCount();
        record.word = fieldSetFlags()[0] ? this.word : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.wordcount = fieldSetFlags()[1] ? this.wordcount : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroWordCount>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroWordCount>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroWordCount>
    READER$ = (org.apache.avro.io.DatumReader<AvroWordCount>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.word);

    out.writeInt(this.wordcount);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.word = in.readString(this.word instanceof Utf8 ? (Utf8)this.word : null);

      this.wordcount = in.readInt();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.word = in.readString(this.word instanceof Utf8 ? (Utf8)this.word : null);
          break;

        case 1:
          this.wordcount = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









