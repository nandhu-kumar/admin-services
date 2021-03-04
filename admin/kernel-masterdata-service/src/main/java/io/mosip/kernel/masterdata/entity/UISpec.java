package io.mosip.kernel.masterdata.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Nagarjuna
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ui_spec", schema = "master")
public class UISpec extends BaseEntity{

	@Id
	@Column(name = "id", nullable = false)
	private String id;
	
	@Column(name = "version", nullable = false)
	private double version;
	
	@Column(name = "domain", nullable = false)
	private String domain;
	
	@Column(name = "title", nullable = false, length=50)
	private String title;
	
	@Column(name="identity_schema_id",nullable = false)
	private String identitySchemaId;
	
	@Column(name = "description", nullable = false, length=50)
	private String description;	
	
	@Column(name = "json_spec", nullable = false, length=10240)
	private String jsonSpec;
	
	@Column(name = "status_code", nullable = false, length=16)
	private String status;
	
	@Column(name = "add_props", nullable = false)
	private boolean additionalProperties;
		 
	@Column(name = "effective_from", nullable = false)
	private LocalDateTime effectiveFrom;
}
