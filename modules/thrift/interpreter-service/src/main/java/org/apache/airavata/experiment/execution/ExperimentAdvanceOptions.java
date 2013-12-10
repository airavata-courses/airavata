/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.experiment.execution;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExperimentAdvanceOptions implements org.apache.thrift.TBase<ExperimentAdvanceOptions, ExperimentAdvanceOptions._Fields>, java.io.Serializable, Cloneable, Comparable<ExperimentAdvanceOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExperimentAdvanceOptions");

  private static final org.apache.thrift.protocol.TField EXECUTION_USER_FIELD_DESC = new org.apache.thrift.protocol.TField("executionUser", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXPERIMENT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("experimentName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CUSTOM_EXPERIMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("customExperimentId", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField WORKFLOW_SCHEDULING_SETTINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("workflowSchedulingSettings", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField WORKFLOW_OUTPUT_DATA_SETTINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("workflowOutputDataSettings", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField SECURITY_SETTINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("securitySettings", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExperimentAdvanceOptionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExperimentAdvanceOptionsTupleSchemeFactory());
  }

  public String executionUser; // required
  public String metadata; // required
  public String experimentName; // required
  public String customExperimentId; // required
  public WorkflowSchedulingSettings workflowSchedulingSettings; // required
  public WorkflowOutputDataSettings workflowOutputDataSettings; // required
  public SecuritySettings securitySettings; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXECUTION_USER((short)1, "executionUser"),
    METADATA((short)2, "metadata"),
    EXPERIMENT_NAME((short)3, "experimentName"),
    CUSTOM_EXPERIMENT_ID((short)4, "customExperimentId"),
    WORKFLOW_SCHEDULING_SETTINGS((short)5, "workflowSchedulingSettings"),
    WORKFLOW_OUTPUT_DATA_SETTINGS((short)6, "workflowOutputDataSettings"),
    SECURITY_SETTINGS((short)7, "securitySettings");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXECUTION_USER
          return EXECUTION_USER;
        case 2: // METADATA
          return METADATA;
        case 3: // EXPERIMENT_NAME
          return EXPERIMENT_NAME;
        case 4: // CUSTOM_EXPERIMENT_ID
          return CUSTOM_EXPERIMENT_ID;
        case 5: // WORKFLOW_SCHEDULING_SETTINGS
          return WORKFLOW_SCHEDULING_SETTINGS;
        case 6: // WORKFLOW_OUTPUT_DATA_SETTINGS
          return WORKFLOW_OUTPUT_DATA_SETTINGS;
        case 7: // SECURITY_SETTINGS
          return SECURITY_SETTINGS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
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

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXECUTION_USER, new org.apache.thrift.meta_data.FieldMetaData("executionUser", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPERIMENT_NAME, new org.apache.thrift.meta_data.FieldMetaData("experimentName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CUSTOM_EXPERIMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("customExperimentId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WORKFLOW_SCHEDULING_SETTINGS, new org.apache.thrift.meta_data.FieldMetaData("workflowSchedulingSettings", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WorkflowSchedulingSettings.class)));
    tmpMap.put(_Fields.WORKFLOW_OUTPUT_DATA_SETTINGS, new org.apache.thrift.meta_data.FieldMetaData("workflowOutputDataSettings", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WorkflowOutputDataSettings.class)));
    tmpMap.put(_Fields.SECURITY_SETTINGS, new org.apache.thrift.meta_data.FieldMetaData("securitySettings", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SecuritySettings.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExperimentAdvanceOptions.class, metaDataMap);
  }

  public ExperimentAdvanceOptions() {
  }

  public ExperimentAdvanceOptions(
    String executionUser,
    String metadata,
    String experimentName,
    String customExperimentId,
    WorkflowSchedulingSettings workflowSchedulingSettings,
    WorkflowOutputDataSettings workflowOutputDataSettings,
    SecuritySettings securitySettings)
  {
    this();
    this.executionUser = executionUser;
    this.metadata = metadata;
    this.experimentName = experimentName;
    this.customExperimentId = customExperimentId;
    this.workflowSchedulingSettings = workflowSchedulingSettings;
    this.workflowOutputDataSettings = workflowOutputDataSettings;
    this.securitySettings = securitySettings;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExperimentAdvanceOptions(ExperimentAdvanceOptions other) {
    if (other.isSetExecutionUser()) {
      this.executionUser = other.executionUser;
    }
    if (other.isSetMetadata()) {
      this.metadata = other.metadata;
    }
    if (other.isSetExperimentName()) {
      this.experimentName = other.experimentName;
    }
    if (other.isSetCustomExperimentId()) {
      this.customExperimentId = other.customExperimentId;
    }
    if (other.isSetWorkflowSchedulingSettings()) {
      this.workflowSchedulingSettings = new WorkflowSchedulingSettings(other.workflowSchedulingSettings);
    }
    if (other.isSetWorkflowOutputDataSettings()) {
      this.workflowOutputDataSettings = new WorkflowOutputDataSettings(other.workflowOutputDataSettings);
    }
    if (other.isSetSecuritySettings()) {
      this.securitySettings = new SecuritySettings(other.securitySettings);
    }
  }

  public ExperimentAdvanceOptions deepCopy() {
    return new ExperimentAdvanceOptions(this);
  }

  @Override
  public void clear() {
    this.executionUser = null;
    this.metadata = null;
    this.experimentName = null;
    this.customExperimentId = null;
    this.workflowSchedulingSettings = null;
    this.workflowOutputDataSettings = null;
    this.securitySettings = null;
  }

  public String getExecutionUser() {
    return this.executionUser;
  }

  public ExperimentAdvanceOptions setExecutionUser(String executionUser) {
    this.executionUser = executionUser;
    return this;
  }

  public void unsetExecutionUser() {
    this.executionUser = null;
  }

  /** Returns true if field executionUser is set (has been assigned a value) and false otherwise */
  public boolean isSetExecutionUser() {
    return this.executionUser != null;
  }

  public void setExecutionUserIsSet(boolean value) {
    if (!value) {
      this.executionUser = null;
    }
  }

  public String getMetadata() {
    return this.metadata;
  }

  public ExperimentAdvanceOptions setMetadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public String getExperimentName() {
    return this.experimentName;
  }

  public ExperimentAdvanceOptions setExperimentName(String experimentName) {
    this.experimentName = experimentName;
    return this;
  }

  public void unsetExperimentName() {
    this.experimentName = null;
  }

  /** Returns true if field experimentName is set (has been assigned a value) and false otherwise */
  public boolean isSetExperimentName() {
    return this.experimentName != null;
  }

  public void setExperimentNameIsSet(boolean value) {
    if (!value) {
      this.experimentName = null;
    }
  }

  public String getCustomExperimentId() {
    return this.customExperimentId;
  }

  public ExperimentAdvanceOptions setCustomExperimentId(String customExperimentId) {
    this.customExperimentId = customExperimentId;
    return this;
  }

  public void unsetCustomExperimentId() {
    this.customExperimentId = null;
  }

  /** Returns true if field customExperimentId is set (has been assigned a value) and false otherwise */
  public boolean isSetCustomExperimentId() {
    return this.customExperimentId != null;
  }

  public void setCustomExperimentIdIsSet(boolean value) {
    if (!value) {
      this.customExperimentId = null;
    }
  }

  public WorkflowSchedulingSettings getWorkflowSchedulingSettings() {
    return this.workflowSchedulingSettings;
  }

  public ExperimentAdvanceOptions setWorkflowSchedulingSettings(WorkflowSchedulingSettings workflowSchedulingSettings) {
    this.workflowSchedulingSettings = workflowSchedulingSettings;
    return this;
  }

  public void unsetWorkflowSchedulingSettings() {
    this.workflowSchedulingSettings = null;
  }

  /** Returns true if field workflowSchedulingSettings is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkflowSchedulingSettings() {
    return this.workflowSchedulingSettings != null;
  }

  public void setWorkflowSchedulingSettingsIsSet(boolean value) {
    if (!value) {
      this.workflowSchedulingSettings = null;
    }
  }

  public WorkflowOutputDataSettings getWorkflowOutputDataSettings() {
    return this.workflowOutputDataSettings;
  }

  public ExperimentAdvanceOptions setWorkflowOutputDataSettings(WorkflowOutputDataSettings workflowOutputDataSettings) {
    this.workflowOutputDataSettings = workflowOutputDataSettings;
    return this;
  }

  public void unsetWorkflowOutputDataSettings() {
    this.workflowOutputDataSettings = null;
  }

  /** Returns true if field workflowOutputDataSettings is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkflowOutputDataSettings() {
    return this.workflowOutputDataSettings != null;
  }

  public void setWorkflowOutputDataSettingsIsSet(boolean value) {
    if (!value) {
      this.workflowOutputDataSettings = null;
    }
  }

  public SecuritySettings getSecuritySettings() {
    return this.securitySettings;
  }

  public ExperimentAdvanceOptions setSecuritySettings(SecuritySettings securitySettings) {
    this.securitySettings = securitySettings;
    return this;
  }

  public void unsetSecuritySettings() {
    this.securitySettings = null;
  }

  /** Returns true if field securitySettings is set (has been assigned a value) and false otherwise */
  public boolean isSetSecuritySettings() {
    return this.securitySettings != null;
  }

  public void setSecuritySettingsIsSet(boolean value) {
    if (!value) {
      this.securitySettings = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXECUTION_USER:
      if (value == null) {
        unsetExecutionUser();
      } else {
        setExecutionUser((String)value);
      }
      break;

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((String)value);
      }
      break;

    case EXPERIMENT_NAME:
      if (value == null) {
        unsetExperimentName();
      } else {
        setExperimentName((String)value);
      }
      break;

    case CUSTOM_EXPERIMENT_ID:
      if (value == null) {
        unsetCustomExperimentId();
      } else {
        setCustomExperimentId((String)value);
      }
      break;

    case WORKFLOW_SCHEDULING_SETTINGS:
      if (value == null) {
        unsetWorkflowSchedulingSettings();
      } else {
        setWorkflowSchedulingSettings((WorkflowSchedulingSettings)value);
      }
      break;

    case WORKFLOW_OUTPUT_DATA_SETTINGS:
      if (value == null) {
        unsetWorkflowOutputDataSettings();
      } else {
        setWorkflowOutputDataSettings((WorkflowOutputDataSettings)value);
      }
      break;

    case SECURITY_SETTINGS:
      if (value == null) {
        unsetSecuritySettings();
      } else {
        setSecuritySettings((SecuritySettings)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXECUTION_USER:
      return getExecutionUser();

    case METADATA:
      return getMetadata();

    case EXPERIMENT_NAME:
      return getExperimentName();

    case CUSTOM_EXPERIMENT_ID:
      return getCustomExperimentId();

    case WORKFLOW_SCHEDULING_SETTINGS:
      return getWorkflowSchedulingSettings();

    case WORKFLOW_OUTPUT_DATA_SETTINGS:
      return getWorkflowOutputDataSettings();

    case SECURITY_SETTINGS:
      return getSecuritySettings();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXECUTION_USER:
      return isSetExecutionUser();
    case METADATA:
      return isSetMetadata();
    case EXPERIMENT_NAME:
      return isSetExperimentName();
    case CUSTOM_EXPERIMENT_ID:
      return isSetCustomExperimentId();
    case WORKFLOW_SCHEDULING_SETTINGS:
      return isSetWorkflowSchedulingSettings();
    case WORKFLOW_OUTPUT_DATA_SETTINGS:
      return isSetWorkflowOutputDataSettings();
    case SECURITY_SETTINGS:
      return isSetSecuritySettings();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExperimentAdvanceOptions)
      return this.equals((ExperimentAdvanceOptions)that);
    return false;
  }

  public boolean equals(ExperimentAdvanceOptions that) {
    if (that == null)
      return false;

    boolean this_present_executionUser = true && this.isSetExecutionUser();
    boolean that_present_executionUser = true && that.isSetExecutionUser();
    if (this_present_executionUser || that_present_executionUser) {
      if (!(this_present_executionUser && that_present_executionUser))
        return false;
      if (!this.executionUser.equals(that.executionUser))
        return false;
    }

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_experimentName = true && this.isSetExperimentName();
    boolean that_present_experimentName = true && that.isSetExperimentName();
    if (this_present_experimentName || that_present_experimentName) {
      if (!(this_present_experimentName && that_present_experimentName))
        return false;
      if (!this.experimentName.equals(that.experimentName))
        return false;
    }

    boolean this_present_customExperimentId = true && this.isSetCustomExperimentId();
    boolean that_present_customExperimentId = true && that.isSetCustomExperimentId();
    if (this_present_customExperimentId || that_present_customExperimentId) {
      if (!(this_present_customExperimentId && that_present_customExperimentId))
        return false;
      if (!this.customExperimentId.equals(that.customExperimentId))
        return false;
    }

    boolean this_present_workflowSchedulingSettings = true && this.isSetWorkflowSchedulingSettings();
    boolean that_present_workflowSchedulingSettings = true && that.isSetWorkflowSchedulingSettings();
    if (this_present_workflowSchedulingSettings || that_present_workflowSchedulingSettings) {
      if (!(this_present_workflowSchedulingSettings && that_present_workflowSchedulingSettings))
        return false;
      if (!this.workflowSchedulingSettings.equals(that.workflowSchedulingSettings))
        return false;
    }

    boolean this_present_workflowOutputDataSettings = true && this.isSetWorkflowOutputDataSettings();
    boolean that_present_workflowOutputDataSettings = true && that.isSetWorkflowOutputDataSettings();
    if (this_present_workflowOutputDataSettings || that_present_workflowOutputDataSettings) {
      if (!(this_present_workflowOutputDataSettings && that_present_workflowOutputDataSettings))
        return false;
      if (!this.workflowOutputDataSettings.equals(that.workflowOutputDataSettings))
        return false;
    }

    boolean this_present_securitySettings = true && this.isSetSecuritySettings();
    boolean that_present_securitySettings = true && that.isSetSecuritySettings();
    if (this_present_securitySettings || that_present_securitySettings) {
      if (!(this_present_securitySettings && that_present_securitySettings))
        return false;
      if (!this.securitySettings.equals(that.securitySettings))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ExperimentAdvanceOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExecutionUser()).compareTo(other.isSetExecutionUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExecutionUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executionUser, other.executionUser);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExperimentName()).compareTo(other.isSetExperimentName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExperimentName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.experimentName, other.experimentName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCustomExperimentId()).compareTo(other.isSetCustomExperimentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCustomExperimentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.customExperimentId, other.customExperimentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWorkflowSchedulingSettings()).compareTo(other.isSetWorkflowSchedulingSettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkflowSchedulingSettings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workflowSchedulingSettings, other.workflowSchedulingSettings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWorkflowOutputDataSettings()).compareTo(other.isSetWorkflowOutputDataSettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkflowOutputDataSettings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workflowOutputDataSettings, other.workflowOutputDataSettings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecuritySettings()).compareTo(other.isSetSecuritySettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecuritySettings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.securitySettings, other.securitySettings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ExperimentAdvanceOptions(");
    boolean first = true;

    sb.append("executionUser:");
    if (this.executionUser == null) {
      sb.append("null");
    } else {
      sb.append(this.executionUser);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("metadata:");
    if (this.metadata == null) {
      sb.append("null");
    } else {
      sb.append(this.metadata);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("experimentName:");
    if (this.experimentName == null) {
      sb.append("null");
    } else {
      sb.append(this.experimentName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("customExperimentId:");
    if (this.customExperimentId == null) {
      sb.append("null");
    } else {
      sb.append(this.customExperimentId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("workflowSchedulingSettings:");
    if (this.workflowSchedulingSettings == null) {
      sb.append("null");
    } else {
      sb.append(this.workflowSchedulingSettings);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("workflowOutputDataSettings:");
    if (this.workflowOutputDataSettings == null) {
      sb.append("null");
    } else {
      sb.append(this.workflowOutputDataSettings);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("securitySettings:");
    if (this.securitySettings == null) {
      sb.append("null");
    } else {
      sb.append(this.securitySettings);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (workflowSchedulingSettings != null) {
      workflowSchedulingSettings.validate();
    }
    if (workflowOutputDataSettings != null) {
      workflowOutputDataSettings.validate();
    }
    if (securitySettings != null) {
      securitySettings.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExperimentAdvanceOptionsStandardSchemeFactory implements SchemeFactory {
    public ExperimentAdvanceOptionsStandardScheme getScheme() {
      return new ExperimentAdvanceOptionsStandardScheme();
    }
  }

  private static class ExperimentAdvanceOptionsStandardScheme extends StandardScheme<ExperimentAdvanceOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExperimentAdvanceOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXECUTION_USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.executionUser = iprot.readString();
              struct.setExecutionUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.metadata = iprot.readString();
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPERIMENT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.experimentName = iprot.readString();
              struct.setExperimentNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CUSTOM_EXPERIMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.customExperimentId = iprot.readString();
              struct.setCustomExperimentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // WORKFLOW_SCHEDULING_SETTINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.workflowSchedulingSettings = new WorkflowSchedulingSettings();
              struct.workflowSchedulingSettings.read(iprot);
              struct.setWorkflowSchedulingSettingsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // WORKFLOW_OUTPUT_DATA_SETTINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.workflowOutputDataSettings = new WorkflowOutputDataSettings();
              struct.workflowOutputDataSettings.read(iprot);
              struct.setWorkflowOutputDataSettingsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SECURITY_SETTINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.securitySettings = new SecuritySettings();
              struct.securitySettings.read(iprot);
              struct.setSecuritySettingsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExperimentAdvanceOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.executionUser != null) {
        oprot.writeFieldBegin(EXECUTION_USER_FIELD_DESC);
        oprot.writeString(struct.executionUser);
        oprot.writeFieldEnd();
      }
      if (struct.metadata != null) {
        oprot.writeFieldBegin(METADATA_FIELD_DESC);
        oprot.writeString(struct.metadata);
        oprot.writeFieldEnd();
      }
      if (struct.experimentName != null) {
        oprot.writeFieldBegin(EXPERIMENT_NAME_FIELD_DESC);
        oprot.writeString(struct.experimentName);
        oprot.writeFieldEnd();
      }
      if (struct.customExperimentId != null) {
        oprot.writeFieldBegin(CUSTOM_EXPERIMENT_ID_FIELD_DESC);
        oprot.writeString(struct.customExperimentId);
        oprot.writeFieldEnd();
      }
      if (struct.workflowSchedulingSettings != null) {
        oprot.writeFieldBegin(WORKFLOW_SCHEDULING_SETTINGS_FIELD_DESC);
        struct.workflowSchedulingSettings.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.workflowOutputDataSettings != null) {
        oprot.writeFieldBegin(WORKFLOW_OUTPUT_DATA_SETTINGS_FIELD_DESC);
        struct.workflowOutputDataSettings.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.securitySettings != null) {
        oprot.writeFieldBegin(SECURITY_SETTINGS_FIELD_DESC);
        struct.securitySettings.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExperimentAdvanceOptionsTupleSchemeFactory implements SchemeFactory {
    public ExperimentAdvanceOptionsTupleScheme getScheme() {
      return new ExperimentAdvanceOptionsTupleScheme();
    }
  }

  private static class ExperimentAdvanceOptionsTupleScheme extends TupleScheme<ExperimentAdvanceOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExperimentAdvanceOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExecutionUser()) {
        optionals.set(0);
      }
      if (struct.isSetMetadata()) {
        optionals.set(1);
      }
      if (struct.isSetExperimentName()) {
        optionals.set(2);
      }
      if (struct.isSetCustomExperimentId()) {
        optionals.set(3);
      }
      if (struct.isSetWorkflowSchedulingSettings()) {
        optionals.set(4);
      }
      if (struct.isSetWorkflowOutputDataSettings()) {
        optionals.set(5);
      }
      if (struct.isSetSecuritySettings()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetExecutionUser()) {
        oprot.writeString(struct.executionUser);
      }
      if (struct.isSetMetadata()) {
        oprot.writeString(struct.metadata);
      }
      if (struct.isSetExperimentName()) {
        oprot.writeString(struct.experimentName);
      }
      if (struct.isSetCustomExperimentId()) {
        oprot.writeString(struct.customExperimentId);
      }
      if (struct.isSetWorkflowSchedulingSettings()) {
        struct.workflowSchedulingSettings.write(oprot);
      }
      if (struct.isSetWorkflowOutputDataSettings()) {
        struct.workflowOutputDataSettings.write(oprot);
      }
      if (struct.isSetSecuritySettings()) {
        struct.securitySettings.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExperimentAdvanceOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.executionUser = iprot.readString();
        struct.setExecutionUserIsSet(true);
      }
      if (incoming.get(1)) {
        struct.metadata = iprot.readString();
        struct.setMetadataIsSet(true);
      }
      if (incoming.get(2)) {
        struct.experimentName = iprot.readString();
        struct.setExperimentNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.customExperimentId = iprot.readString();
        struct.setCustomExperimentIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.workflowSchedulingSettings = new WorkflowSchedulingSettings();
        struct.workflowSchedulingSettings.read(iprot);
        struct.setWorkflowSchedulingSettingsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.workflowOutputDataSettings = new WorkflowOutputDataSettings();
        struct.workflowOutputDataSettings.read(iprot);
        struct.setWorkflowOutputDataSettingsIsSet(true);
      }
      if (incoming.get(6)) {
        struct.securitySettings = new SecuritySettings();
        struct.securitySettings.read(iprot);
        struct.setSecuritySettingsIsSet(true);
      }
    }
  }

}
