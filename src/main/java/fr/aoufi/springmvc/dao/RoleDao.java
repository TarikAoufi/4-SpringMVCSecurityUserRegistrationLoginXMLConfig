package fr.aoufi.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.aoufi.springmvc.model.Role;


public interface RoleDao extends JpaRepository<Role, Long> {

}
